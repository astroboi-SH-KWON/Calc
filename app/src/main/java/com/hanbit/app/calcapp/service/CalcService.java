package com.hanbit.app.calcapp.service;

import com.hanbit.app.calcapp.domain.CalcBean;

/**
 * Created by hb2003 on 2017-02-04.
 */

public interface CalcService {
    public int plus(CalcBean param);//은닉화
    public int minus(CalcBean param);
    public int multi(CalcBean param);
    public int div(CalcBean param);
    public int mod(CalcBean param);

}
