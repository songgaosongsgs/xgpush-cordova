package com.eteng.push.xgpush;

import android.app.Activity;
import android.content.Context;

import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.horse.Tools;

public class XGPlugin extends PushPlugin {

	@Override
	protected void onEnableDebug(Context context, boolean enable) {
		XGPushConfig.enableDebug(context, enable);
	}

	@Override
	protected void onRegisterPush(Context context) {
		XGPushManager.registerPush(context);
	}

	@Override
	protected void onRegisterAccount() {
	}

	@Override
	protected void onUnregisterPush(Context context) {
		XGPushManager.unregisterPush(context);
	}

	@Override
	protected void onSetTag(Context context, String tag) {
		XGPushManager.setTag(context, tag);
	}

	@Override
	protected void onDeleteTag(Context context, String tag) {
		XGPushManager.deleteTag(context, tag);
	}

	@Override
	protected void onClearCache(Context context) {
		Tools.clearCacheServerItems(context);
		Tools.clearOptStrategyItem(context);
	}

	@Override
	protected void onActivityPause(Activity activity) {
		XGPushManager.onActivityStoped(activity);
	}

	@Override
	protected void onActivityResume(Activity activity) {
		XGPushManager.onActivityStarted(activity);
	}
	

}
