public class SubscriptionSubject implements Subject{
    private List<Observer> weiXinUbserList=new ArrayList<Observer>();

    public void attach(Observer observer){
        weiXinUbserList.add(observer);
    }

    public void detach(Observer observer){
        weiXinUbserList.remove(observer);
    }

    public void notify(String message){
        for(Observer observer:weiXinUbserList)
            observer.update(message);
    }
}