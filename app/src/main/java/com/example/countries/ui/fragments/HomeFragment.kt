package com.example.countries.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.countries.databinding.FragmentHomeBinding
import com.example.countries.ui.activity.MainActivity
import com.example.countries.ui.activity.MainActivity2
import com.example.countries.ui.ux.adapter.HomeAdapter
import com.example.countries.ui.ux.adapter.ItemEvents
import com.example.countries.ui.ux.data.CountriesItem

const val SEND_DATA_TO_SECOND_ACTIVITY = "SEND_DATA"

class HomeFragment : Fragment(), ItemEvents {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = arrayListOf<CountriesItem>(
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1200px-Flag_of_the_United_States.svg.png",
                "United States of America",
                "Federal",
                "The United States of America (U.S.A. or USA), commonly known as the United States (U.S. or US) or America, is a transcontinental country primarily located in North America. It consists of 50 states, a federal district, five major unincorporated territories, nine minor outlying islands,[i] and 326 Indian reservations with limited sovereignty. It is the third-largest country by both land and total area.[c] The United States shares land borders with Canada to the north and with Mexico to the south as well as maritime borders with the Bahamas, Cuba, and Russia, among others.[j] It has a population of over 331 million,[d] and is the third most populous country in the world. The national capital is Washington, D.C., and the most populous city and financial center is New York City. The United States is a melting pot of cultures and ethnicities, and its population has been profoundly shaped by centuries of immigration. It has a highly diverse climate and geography and is officially recognized as one of the 17 ecologically megadiverse countries.",
                "https://loveincorporated.blob.core.windows.net/contentimages/gallery/f9e60090-883e-44b1-8fa6-1afae17a5891-3-grand-prismatic.jpg",
                "https://www.ivywise.com/core/wp-content/uploads/2020/04/stanford.jpg",
                "https://applyplus.org/img/University/05-02-2020-1580921520.jpg",
                "http://images.hamshahrionline.ir//images/2014/3/MIT.jpg",
                "https://en.wikipedia.org/wiki/United_States",
                "https://ecophiles.com/wp-content/uploads/2017/09/6026253268_efc4cf9323_o-759x500.jpg",
                "https://besthqwallpapers.com/Uploads/18-4-2020/129051/thumb2-sequoias-sunset-forest-bright-rays-beautiful-nature.jpg",
                "https://www.pandotrip.com/wp-content/uploads/2016/03/Zion-740x511.jpg",
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Flag_of_Turkey.svg/1200px-Flag_of_Turkey.svg.png",
                "Turkey",
                "Republic",
                "Turkey,[a] officially the Republic of Türkiye,[b] is a transcontinental country located mainly on the Anatolian Peninsula in Western Asia, with a small portion on the Balkan Peninsula in Southeast Europe. It shares borders with the Black Sea to the north; Georgia to the northeast; Armenia, Azerbaijan, and Iran to the east; Iraq to the southeast; Syria and the Mediterranean Sea to the south; the Aegean Sea to the west; and Greece and Bulgaria to the northwest. Cyprus is located off the south coast. Turks form the vast majority of the nation's population and Kurds are the largest minority.[4] Ankara is Turkey's capital, while Istanbul is its largest city and financial centre.",
                "https://theculturetrip.com/wp-content/uploads/2021/06/2ea8x7g-1.jpg",
                "http://safirsayee.com/wp-content/uploads/2021/03/boga3-min.jpg",
                "http://ezapply.ir/sliders/slider_1549895531.jpg",
                "https://soha-education.ir/wp-content/uploads/2021/03/%DA%A9%D9%88%DA%86.jpg",
                "https://en.wikipedia.org/wiki/Turkey",
                "https://img.traveltriangle.com/blog/wp-content/uploads/2018/09/covers-turkey.jpg",
                "https://travel-videos.net/wp-content/uploads/2021/01/The-beauty-of-nature-on-the-Turkish-Riviera.jpg",
                "https://www.propertyturkey.com/uploads/pages/larg/cappadocia_10.jpg",
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/2560px-Flag_of_the_People%27s_Republic_of_China.svg.png",
                "China",
                "People's Republic",
                "China (Chinese: 中国; pinyin: Zhōngguó), officially the People's Republic of China (PRC; Chinese: 中华人民共和国; pinyin: Zhōnghuá Rénmín Gònghéguó), is a country in East Asia. It is the world's most populous country, with a population of more than 1.4 billion people. China spans five geographical time zones and borders 14 countries, the second most of any country in the world after Russia. Covering an area of approximately 9.6 million square kilometers (3,700,000 sq mi), it is the world's third or fourth largest country.[i] The country consists of 23 provinces,[j] five autonomous regions, four municipalities, and two Special Administrative Regions (Hong Kong and Macau). The national capital is Beijing, and the most populous city and financial center is Shanghai.",
                "https://cf.bstatic.com/data/xphoto/1182x887/109/10997349.jpg?size=S",
                "https://www.chinadaily.com.cn/china/images/attachement/jpg/site1/20120903/f04da2db148411ae39c461.jpg",
                "http://safirsayee.com/wp-content/uploads/2021/03/DZ7tKvKU0AE2i9l-min.jpg",
                "http://safirsayee.com/wp-content/uploads/2021/03/shutterstock_33976729-min.jpg",
                "https://en.wikipedia.org/wiki/China",
                "https://cf.bstatic.com/data/xphoto/1182x887/109/10997349.jpg?size=S",
                "https://media.nature.com/lw800/magazine-assets/d41586-020-00362-4/d41586-020-00362-4_17649716.jpg",
                "https://www.studyinchina.com.my/web/page/china-the-land-of-variety-charm-and-beauty/uploads/Variety%20of%20China/vc1.jpg",
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png",
                "Germany",
                "Federal Republic",
                "Germany (German: Deutschland, pronounced [ˈdɔʏtʃlant] (listen)), officially the Federal Republic of Germany,[f] is a country in Central Europe. It is the second most populous country in Europe after Russia, and the most populous member state of the European Union. Germany is situated between the Baltic and North seas to the north, and the Alps to the south; it covers an area of 357,022 square kilometres (137,847 sq mi), with a population of almost 84 million within its 16 constituent states. Germany borders Denmark to the north, Poland and the Czech Republic to the east, Austria and Switzerland to the south, and France, Luxembourg, Belgium, and the Netherlands to the west. The nation's capital and largest city is Berlin and its financial centre is Frankfurt; the largest urban area is the Ruhr.",
                "https://img.theculturetrip.com/wp-content/uploads/2018/05/shutterstock_257790382.jpg",
                "https://storage-prtl-co.imgix.net/endor/articles/2991/images/1635422817_shutterstock_681810706.jpg?max-w=660&max-h=532&fit=crop&auto=format,compress&q=40",
                "https://simeakhar.org/media/images/2021_05_12/%D8%AF%D8%A7%D9%86%D8%B4%DA%AF%D8%A7%D9%87-%D9%87%D9%88%D9%85%D8%A8%D9%88%D9%84%D8%AA-%D8%A8%D8%B1%D9%84%DB%8C%D9%86.2e16d0ba.fill-40000x30000.jpg",
                "https://sirapply.com/Portals/0/EasyDNNnews/99/img-123.jpg",
                "https://en.wikipedia.org/wiki/Germany",
                "https://loveincorporated.blob.core.windows.net/contentimages/gallery/4c688571-6279-4589-8316-c1bfc411fb02-Saar_River_Germany.jpg",
                "https://image.jimcdn.com/app/cms/image/transf/none/path/sa6549607c78f5c11/image/i18a8833639d10411/version/1606405973/best-natural-wonders-in-germany-konigsee-lake-copyrignt-canadastock-european-best-destinations.jpg",
                "https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AALm4MV.img?h=552&w=750&m=6&q=60&u=t&o=f&l=f",
            ),
            CountriesItem(
                "https://www.irflag.com/images/iran-flag-in-history_3.png",
                "Iran",
                "Republic",
                "Iran (Persian: ایران Irân [ʔiːˈɾɒːn] (listen)), also called Persia,[11] and officially the Islamic Republic of Iran,[a] is a country in Western Asia. It is bordered by Iraq and Turkey to the west, by Azerbaijan and Armenia to the northwest, by the Caspian Sea and Turkmenistan to the north, by Afghanistan and Pakistan to the east, and by the Gulf of Oman and the Persian Gulf to the south. It covers an area of 1,648,195 km2 (636,372 sq mi), making it the fourth-largest country entirely in Asia and the second-largest country in Western Asia behind Saudi Arabia. Iran has a population of 85 million, making it the 17th-most populous country in the world.[12] Its largest cities, in descending order, are the capital Tehran, Mashhad, Isfahan, Karaj, Shiraz, and Tabriz.",
                "https://iranamaze.com/wp-content/uploads/2022/02/Asalem-Khalkhal-Gilan-Fog-1.jpg",
                "https://media.tehrantimes.com/d/t/2021/04/06/4/3735738.jpg",
                "https://static3.nasim.news/servev2/MjEyOTE26TuJ/WRbv5kvHr44,/MjEyOTE26TuJ.jpg",
                "https://images.kojaro.com/2022/5/2cda0ad5-ee2c-4b39-98d9-1055d7533f5d-840x560.jpg",
                "https://en.wikipedia.org/wiki/Iran",
                "https://theculturetrip.com/wp-content/uploads/2015/07/people-walking-through-stars-valley--mountain-range-at-qeshm-island-iran.jpg",
                "https://theculturetrip.com/wp-content/uploads/2015/07/shutterstock_241210558-picturesque-mosque-underneath-volcano-damavand-highest-peak-in-iran.jpg",
                "https://www.irandestination.com/wp-content/uploads/2020/07/natural-features-in-Iran-8.jpg",
            ),
            CountriesItem(
                "https://cdn.britannica.com/68/7068-004-7848FEB4/Flag-Canada.jpg",
                "Canada",
                "Federal",
                "Canada is a country in North America. Its ten provinces and three territories extend from the Atlantic Ocean to the Pacific Ocean and northward into the Arctic Ocean, covering over 9.98 million square kilometres (3.85 million square miles), making it the world's second-largest country by total area. Its southern and western border with the United States, stretching 8,891 kilometres (5,525 mi), is the world's longest binational land border. Canada's capital is Ottawa, and its three largest metropolitan areas are Toronto, Montreal, and Vancouver.",
                "https://www.readersdigest.ca/wp-content/uploads/2013/11/canada-awe-inspiring-natural-wonders-northern-lights.jpg",
                "https://www.timeshighereducation.com/sites/default/files/university_of_toronto_1.jpg",
                "https://trustimm.com/wp-content/uploads/2020/02/University_College_University_of_Toronto-1024x640-1.jpg",
                "http://ircanada.ir/wp-content/uploads/2020/11/%D8%B4%D8%A7%D8%A7%D8%AE%D8%B5.jpg",
                "https://en.wikipedia.org/wiki/Canada",
                "https://content.api.news/v3/images/bin/8246e9367ffabb9af0865e681531e39f?width=650",
                "https://wallpaperaccess.com/full/2724794.jpg",
                "https://cf.bstatic.com/data/xphoto/1182x887/500/50041453.jpg?size=S",
            )
        )

        val myAdapter = HomeAdapter(data, this)

        binding.recyclerHome.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        binding.recyclerHome.adapter = myAdapter

    }

    override fun onItemClicked(countriesItem: CountriesItem) {
        val intent = Intent(activity, MainActivity2::class.java)
        intent.putExtra(SEND_DATA_TO_SECOND_ACTIVITY, countriesItem)
        startActivity(intent)
    }
}