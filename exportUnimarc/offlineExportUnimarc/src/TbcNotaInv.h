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
/*
 * TbcNotaInv.h
 *
 *  Created on: 20-nov-2009
 *      Author: Arge
 */


#ifndef TBCNOTAINV_H_
#define TBCNOTAINV_H_

#include "Tb.h"

class TbcNotaInv: public Tb {
	void getPrimaryKey(CString &pKey);

public:
	enum fieldId {
		cd_polo,
		cd_bib,
		cd_serie,
		cd_inven,
		cd_nota,
		ds_nota_libera,
		ute_ins,
		ts_ins,
		ute_var,
		ts_var,
		fl_canc
		};

	TbcNotaInv(CFile *tbIn, CFile *tbOffsetIn, char *offsetBufferTbPtr, long elementsTb, int keyPlusOffsetPlusLfLength, int key_length);

	~TbcNotaInv();
	virtual bool loadNextRecord(const char *key);
	};
#endif /* TBCNOTAINV_H_ */
