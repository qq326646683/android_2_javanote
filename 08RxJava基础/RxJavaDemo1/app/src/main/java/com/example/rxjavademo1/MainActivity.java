package com.example.rxjavademo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1.创建一个Observable 可被观察的
        Observable observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter emitter) throws Exception {
                if (!emitter.isDisposed()) {
                    emitter.onNext("hello rxjava2-1111");
                    emitter.onNext("hello rxjava2-2222");

                }
                emitter.onComplete();
            }
        });

        // 2.创建一个Observer观察者
        Observer observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                Log.i("nell:onNext", s);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                Log.i("nell:onComplete", "onComplete");

            }
        };

        // 3.观察者observer订阅被观察observable
        observable.subscribe(observer);

    }
}