package com.tojc.ormlite.android.test.provider;

import com.tojc.ormlite.android.OrmLiteSimpleContentProvider;
import com.tojc.ormlite.android.framework.MimeTypeVnd.SubType;
import com.tojc.ormlite.android.test.model.Account;
import com.tojc.ormlite.android.test.model.Membership;

public class UnderTestSampleProvider extends OrmLiteSimpleContentProvider<SampleHelper> {
    @Override
    protected Class<SampleHelper> getHelperClass() {
        return SampleHelper.class;
    }

    @Override
    public boolean onCreate() {
        int patternCode = 1;
        setMatcherController(new MatcherController()//
                .add(Account.class, SubType.Directory, "", patternCode++)//
                .add(Account.class, SubType.Item, "#", patternCode++)//
                .add(Membership.class, SubType.Directory, "", patternCode++)//
                .add(Membership.class, SubType.Item, "#", patternCode++));
        return true;
    }
}