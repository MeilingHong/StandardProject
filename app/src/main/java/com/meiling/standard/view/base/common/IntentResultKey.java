package com.meiling.standard.view.base.common;

/**
 * Created by Hz on 2018-11-19.
 */

public interface IntentResultKey {
    /*
     * 可以考虑使用这种形式来区分不同业务，同时也减少了过多类引起的混乱
     */
    interface LoginResult{
        String PHONE = "phone";
    }
}
