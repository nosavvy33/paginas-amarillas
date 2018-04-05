package com.undead.nosavvy.paginasamarillas.repositories;

import com.undead.nosavvy.paginasamarillas.models.Business;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nosavvy on 4/5/18.
 */

public class BusinessRepository {

    private static List<Business> business= new ArrayList<>();
//    public Business(String name, String address, String logo, String tag, String number) {



    static{
        business.add(new Business("Mackie","Michigan, Default 123","lg_mackie","tech","12345678","was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
        business.add(new Business("Asus","Tokyo, Matsuhita 123","lg_asus","tech","999999","was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
        business.add(new Business("SkullCandy","California, Main Street 123","lg_skull","tech","555555","was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
        business.add(new Business("Bembos","Lima, Jr. de la Union 432","lg_bembos","food","44444","was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
        business.add(new Business("Inkafarma","Lima, Jr. de la Union 987","lg_inka","meds","777777","r, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsu"));
        business.add(new Business("Starbucks","Lima, Jr. de la Union 654","lg_star","food","852365","11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"));
        business.add(new Business("Tecsup","Lima, av. Huanca 123","lg_tecsup","education","5123123","222222222222222222222222222222222222222222222222222222222222222222222222222"));
        business.add(new Business("Tusquets","Madrid, calle Los Aires 312","lg_tusquets","education","665421","33333333333333333333333333333333333333333333333333333333"));
    }

    public static List<Business> getList(){
        /*
        List<Person> beerDrinkers = persons.stream()
    .filter(p -> p.getAge() > 16).collect(Collectors.toList());
         */
        return business;
    }

    public static List<Business> search(String word){
        //List<Business> result = business.filter(p -> p.tag.equals());
        //FUNCION LAMBDA
        List<Business> result = (List<Business>) business.stream().filter(p -> p.getTag().equals(word));
        return result;
    }
}
