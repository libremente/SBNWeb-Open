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
import it.finsiel.sbn.polo.orm.viste.Ve_titolo_cla_mar;

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
public class Ve_titolo_cla_marResult extends it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao{

    public Ve_titolo_cla_marResult(Ve_titolo_cla_mar ve_titolo_cla_mar) throws InfrastructureException {
        super();
        this.valorizzaParametro(ve_titolo_cla_mar.leggiAllParametro());
    }


	 /*
    <statement nome="selectPerClasse" tipo="select" id="02_taymer">
            <fisso>
                WHERE
                  cd_edizione = XXXcd_edizione
                  AND cd_sistema = XXXcd_sistema
                  AND classe = XXXclasse
            </fisso>
    <filter name="VE_TITOLO_CLA_MAR_selectPerClasse"
            condition="cd_edizione = :XXXcd_edizione
                       AND cd_sistema = :XXXcd_sistema
                       AND classe = :XXXclasse "/>
	 * @param opzioni
	 * @return List
	 * @throws InfrastructureException
	 */
	public List<Ve_titolo_cla_mar> selectPerClasse(HashMap opzioni)
			throws InfrastructureException {
		try {
			HashMap myOpzioni = (HashMap) opzioni.clone();
			Session session = this.getSession();
			this.beginTransaction();
			this.basicCriteria = session.createCriteria(Ve_titolo_cla_mar.class);
			Filter filter = session.enableFilter("VE_TITOLO_CLA_MAR_selectPerClasse");


			filter.setParameter(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_edizione,
                    opzioni.get(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_edizione));

            filter.setParameter(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_sistema,
                    opzioni.get(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_sistema));

            filter.setParameter(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXclasse,
                    opzioni.get(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXclasse));

            myOpzioni.remove(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_edizione);
            myOpzioni.remove(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_sistema);
            myOpzioni.remove(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXclasse);

            this.createCriteria(myOpzioni);
            this.basicCriteria = Parameter.setOrdinamento(myOpzioni,
                    "Ve_titolo_cla_mar",
                    this.basicCriteria, session);

			List<Ve_titolo_cla_mar> result = this.basicCriteria.list();
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
    <statement nome="countPerClasse" tipo="count" id="03_taymer">
            <fisso>
                SELECT COUNT (distinct (bid) ) FROM Ve_titolo_cla_mar
                WHERE
                  cd_edizione = XXXcd_edizione
                  AND cd_sistema = XXXcd_sistema
                  AND classe = XXXclasse
            </fisso>
     <filter name="VE_TITOLO_CLA_MAR_countPerClasse"
             condition="cd_edizione = :XXXcd_edizione
                       AND cd_sistema = :XXXcd_sistema
                       AND classe = :XXXclasse "/>
	 * @param opzioni
	 * @return Integer
	 * @throws InfrastructureException
	 */
	public Integer countPerClasse(HashMap opzioni)
			throws InfrastructureException {
		try {
			HashMap myOpzioni = (HashMap) opzioni.clone();
			Session session = this.getSession();
			this.beginTransaction();
			this.basicCriteria = session.createCriteria(Ve_titolo_cla_mar.class);
            Filter filter = session.enableFilter("VE_TITOLO_CLA_MAR_countPerClasse");


            filter.setParameter(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_edizione,
                    opzioni.get(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_edizione));

            filter.setParameter(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_sistema,
                    opzioni.get(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_sistema));

            filter.setParameter(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXclasse,
                    opzioni.get(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXclasse));

            myOpzioni.remove(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_edizione);
            myOpzioni.remove(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXcd_sistema);
            myOpzioni.remove(it.finsiel.sbn.polo.dao.common.viste.Ve_titolo_cla_marCommonDao.XXXclasse);

            this.createCriteria(myOpzioni);
            this.basicCriteria = Parameter.setOrdinamento(myOpzioni,
                    "Ve_titolo_cla_mar",
                    this.basicCriteria, session);

			Integer result = (Integer) this.basicCriteria.setProjection(
					Projections.projectionList().add(
							Projections.countDistinct("BID"))).uniqueResult();

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
