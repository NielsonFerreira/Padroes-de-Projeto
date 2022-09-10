package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;

public class IPhone11ProFactory extends IPhoneFactory{
    @Override
    protected IPhone createIphone() {
        return new br.com.cod3r.factory.apple.model.IPhone11Pro();
    }
}
