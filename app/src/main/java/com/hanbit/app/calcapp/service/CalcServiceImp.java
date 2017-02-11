package com.hanbit.app.calcapp.service;

import com.hanbit.app.calcapp.domain.CalcBean;

/**
 * Created by hb2003 on 2017-02-04.
 */

public class CalcServiceImp implements CalcService{
    @Override
    public int plus(CalcBean param) {
        return param.getFirstNum()+param.getSecondNum();
    }

    @Override
    public int minus(CalcBean param) {
        return param.getFirstNum()-param.getSecondNum();
    }

    @Override
    public int multi(CalcBean param) {
        return param.getFirstNum()*param.getSecondNum();
    }

    @Override
    public int div(CalcBean param) {
        return param.getFirstNum()/param.getSecondNum();
    }

    @Override
    public int mod(CalcBean param) {
        return param.getFirstNum()%param.getSecondNum();
    }
}
