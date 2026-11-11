package lessons10;

 class TestIface2 {
     public static void main(String[] args) {
         Callback c = new Client();
         AnotherClient ob = new AnotherClient();

         c.callback(42);

                      // теперь переменная с ссылается на
         c = ob;          // объект типа AnotherClient
         c.callback(42);
     }
 }