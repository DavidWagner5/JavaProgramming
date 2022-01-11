package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("Ca", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false,false,true,true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank of America", "BA", 130000, true,true,false,true);



        Offer [] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();
        fullTimeOffers.addAll(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFulltime);
        System.out.println(fullTimeOffers.size());//removes if not fulltime


        ArrayList<Offer> localOffers = new ArrayList<>();
        localOffers.addAll(Arrays.asList(myOffers));
        localOffers.removeIf(p ->!p.location.equals("VA"));//removes offer if the offer is not local
        System.out.println(localOffers);

        ArrayList<Offer> ptoOrBenefit = new ArrayList<>();
        ptoOrBenefit.addAll(Arrays.asList(myOffers));
        ptoOrBenefit.removeIf(p -> p.hasBenefit==false && p.hasPTO==false);
        System.out.println(ptoOrBenefit);









    }
    //how many offers are fulltime?


}
