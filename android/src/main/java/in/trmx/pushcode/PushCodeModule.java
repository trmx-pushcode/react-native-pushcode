package in.trmx.pushcode;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class PushCodeModule extends ReactContextBaseJavaModule {
    public PushCodeModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "PushCode";
    }

    @ReactMethod
    public void add(int a, int b, Promise promise) {
        promise.resolve(a + b);
    }
}
