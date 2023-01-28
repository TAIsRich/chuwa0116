public class LambdaLearn{
    public void overrideFoo(){
        Foo fooByIC = new Foo() {
            @Override
            public String aMethod(String string) {
                return string + " from Foo";
            }
        };
        String hello = fooByIC.aMethod("hello");
        System.out.println(hello);
    }

    public void lambdaFoo(){
        Foo foo=parameter->parameter+" from foo";
        String hellp=foo.aMethod("Hello");
        System.out.println(hello);
    }

    public void lambdaFoo2(){
        Foo foo=parameter->parameter.toUpperCase()+" from foo";
        String hello=foo.aMethod("hello");
        System.out.println(hello);
    }

    public void testFinal(){
        final String localVariable="Local";
        Foo foo=parameter->{
            return parameter+" "+localVariable;
        }
        System.out.println(foo.aMethod("hello"));
    }
    public void testEffectiveFinal(){
        String localVariable="Local";
        Foo foo=parameter->{
            return parameter+" "+localVariable;
        }
        System.out.println(foo.aMethod("hello"));
    }
    public void testFinal21(){
        String localVariable="Local";
        localVariable="LOCAL";//new address
        Foo foo = parameter -> {
//            return parameter + " " + localVariable;
            return parameter;
        };

        System.out.println(foo.aMethod("hello"));

    }
    public void testFinal22(){
        String localVariable = "Local";

        Foo foo = parameter -> {
//            return parameter + " " + localVariable;
            return parameter;
        };

        localVariable="LOCAL";
        System.out.println(foo.aMethod("hello"));

    }
    public void testFinal3(){
        List<Employees>employees=EmployeeData.getEmployees();
        Employee employee=employees.get(0);
        employee.setAge(55);
        Foo foo=parameter->{
            return parameter+" "+employee;
        }
        System.out.println(foo.aMethod("hello"));
    }
}