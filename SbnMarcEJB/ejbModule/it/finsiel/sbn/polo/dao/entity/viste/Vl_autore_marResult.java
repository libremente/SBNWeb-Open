/*******************************************************************************
 * Copyright (C) 2019 ICCU - Istituto Centrale per il Catalogo Unico
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package it.finsiel.sbn.polo.dao.entity.viste;

import it.finsiel.sbn.exception.InfrastructureException;
import it.finsiel.sbn.polo.dao.vo.Parameter;
import it.finsiel.sbn.polo.orm.viste.Vl_autore_mar;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

/**
 * TODO Da Testare
 * @author Antonio
 *
 */
public class Vl_autore_marResult extends it.finsiel.sbn.polo.dao.common.viste.Vl_autore_marCommonDao{

    public Vl_autore_marResult(Vl_autore_mar vl_autore_mar) throws InfrastructureException {
        super();
        this.valorizzaParametro(vl_autore_mar.leggiAllParametro());
    }
     /*
    <statement nome="selectAutorePerMarca"  tipo="select" id="01">
            <fisso>
                WHERE mid  = XXXmid
            </fisso>
    <filter name="VL_AUTORE_MAR_selectAutorePerMarca" condition="mid  = :XXXmid "/>
	 * @param opzioni
	 * @return List
	 * @throws InfrastructureException
	 */
	public List<Vl_autore_mar> selectAutorePerMarca(HashMap opzioni)
			throws InfrastructureException {
		try {
			HashMap myOpzioni = (HashMap) opzioni.clone();
			Session session = this.getSession();
			this.beginTransaction();
			this.basicCriteria = session.createCriteria(Vl_autore_mar.class);
			Filter filter = session.enableFilter("VL_AUTORE_MAR_selectAutorePerMarca");

			filter.setParameter(it.finsiel.sbn.polo.dao.common.viste.Vl_autore_marCommonDao.XXXmid,
                    opzioni.get(it.finsiel.sbn.polo.dao.common.viste.Vl_autore_marCommonDao.XXXmid));

            myOpzioni.remove(it.finsiel.sbn.polo.dao.common.viste.Vl_autore_marCommonDao.XXXmid);

            this.createCriteria(myOpzioni);
            this.basicCriteria = Parameter.setOrdinamento(myOpzioni,
                    "Vl_autore_mar",
                    this.basicCriteria, session);

			List<Vl_autore_mar> result = this.basicCriteria.list();
			this.commitTransaction();
			this.closeSession();
			return result;
		} catch (InfrastructureException ife) {
			throw ife;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new InfrastructureException();
		}
	}
	/*
    <statement nome="countAutorePerMarca"  tipo="count" id="01">
            <fisso>
            SELECT COUNT(*) FROM Vl_autore_marCommonDao
                WHERE mid  = XXXmid
            </fisso>
     <filter name="VL_AUTORE_MAR_countAutorePerMarca" condition="mid  = :XXXmid "/>
	 * @param opzioni
	 * @return Integer
	 * @throws InfrastructureException
	 */
    public Integer countAutorePerMarca(HashMap opzioni)
    throws InfrastructureException {
        try {
            HashMap myOpzioni = (HashMap) opzioni.clone();
            Session session = this.getSession();
            this.beginTransaction();
            this.basicCriteria = session.createCriteria(Vl_autore_mar.class);
            Filter filter = session.enableFilter("VL_AUTORE_MAR_countAutorePerMarca");


            filter.setParameter(it.finsiel.sbn.polo.dao.common.viste.Vl_autore_marCommonDao.XXXmid,
                    opzioni.get(it.finsiel.sbn.polo.dao.common.viste.Vl_autore_marCommonDao.XXXmid));


            myOpzioni.remove(it.finsiel.sbn.polo.dao.common.viste.Vl_autore_marCommonDao.XXXmid);

            this.createCriteria(myOpzioni);
            this.basicCriteria = Parameter.setOrdinamento(myOpzioni,
                    "Vl_autore_mar", this.basicCriteria, session);


            Integer result = (Integer) this.basicCriteria.setProjection(
                    Projections.projectionList()
                      .add( Projections.rowCount())).uniqueResult();

            this.commitTransaction();
            this.closeSession();
            return result;
        } catch (InfrastructureException ife) {
            throw ife;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new InfrastructureException();
        }
    }


}
