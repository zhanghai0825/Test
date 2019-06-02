package prox;

import dao.Reading;
import dao.impl.Home;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxRead implements InvocationHandler {
      private Object target;

      public Object bind(Object target){
          this.target=target;
         return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this); }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
          Object res=null;
          res = method.invoke(target,args);
          return res;
    }
}
