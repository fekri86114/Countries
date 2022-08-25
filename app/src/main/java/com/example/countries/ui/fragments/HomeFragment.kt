package com.example.countries.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.countries.databinding.FragmentHomeBinding
import com.example.countries.ui.ux.adapter.HomeAdapter
import com.example.countries.ui.ux.data.CountriesItem

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = arrayListOf<CountriesItem>(
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/commons/e/e2/Iran_flag_300.png",
                "Iran",
                "Islamic Republic",
                "Iran (Persian: ایران Irân [ʔiːˈɾɒːn] (listen)), also called Persia,[11] and officially the Islamic Republic of Iran,[a] is a country in Western Asia. It is bordered by Iraq and Turkey to the west, by Azerbaijan and Armenia to the northwest, by the Caspian Sea and Turkmenistan to the north, by Afghanistan and Pakistan to the east, and by the Gulf of Oman and the Persian Gulf to the south. It covers an area of 1,648,195 km2 (636,372 sq mi), making it the fourth-largest country entirely in Asia and the second-largest country in Western Asia behind Saudi Arabia. Iran has a population of 85 million, making it the 17th-most populous country in the world.[12] Its largest cities, in descending order, are the capital Tehran, Mashhad, Isfahan, Karaj, Shiraz, and Tabriz.",
                "https://media.tehrantimes.com/d/t/2020/11/28/3/3613813.jpg",
                "https://www.fodors.com/wp-content/uploads/2020/01/IranCulturalSites__HERO_shutterstock_1298384731.jpg"
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Flag_of_Turkey.svg/1200px-Flag_of_Turkey.svg.png",
                "Turkey",
                "Republic",
                "Turkey,[a] officially the Republic of Türkiye,[b] is a transcontinental country located mainly on the Anatolian Peninsula in Western Asia, with a small portion on the Balkan Peninsula in Southeast Europe. It shares borders with the Black Sea to the north; Georgia to the northeast; Armenia, Azerbaijan, and Iran to the east; Iraq to the southeast; Syria and the Mediterranean Sea to the south; the Aegean Sea to the west; and Greece and Bulgaria to the northwest. Cyprus is located off the south coast. Turks form the vast majority of the nation's population and Kurds are the largest minority.[4] Ankara is Turkey's capital, while Istanbul is its largest city and financial centre.",
                "https://upload.wikimedia.org/wikipedia/commons/5/5d/Bosphorus_University.jpg",
                "https://nilatrip.com/wp-content/uploads/2021/07/nature-turkey-nila.jpg"
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/2560px-Flag_of_the_People%27s_Republic_of_China.svg.png",
                "China",
                "People's Republic",
                "China (Chinese: 中国; pinyin: Zhōngguó), officially the People's Republic of China (PRC; Chinese: 中华人民共和国; pinyin: Zhōnghuá Rénmín Gònghéguó), is a country in East Asia. It is the world's most populous country, with a population of more than 1.4 billion people. China spans five geographical time zones and borders 14 countries, the second most of any country in the world after Russia. Covering an area of approximately 9.6 million square kilometers (3,700,000 sq mi), it is the world's third or fourth largest country.[i] The country consists of 23 provinces,[j] five autonomous regions, four municipalities, and two Special Administrative Regions (Hong Kong and Macau). The national capital is Beijing, and the most populous city and financial center is Shanghai.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/HKUST_campus_view_looking_from_above.jpg/1200px-HKUST_campus_view_looking_from_above.jpg",
                "https://cf.bstatic.com/xdata/images/xphoto/2048x1536/10996954.jpg?k=71f62ae7570ea52fb25cda06b90235e46008e5a26926f3938b473f121d1ca81d&o="
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/1200px-Flag_of_India.svg.png",
                "India",
                "Republic",
                "India, officially the Republic of India (Hindi: Bhārat Gaṇarājya),[26] is a country in South Asia. It is the seventh-largest country by area, the second-most populous country, and the most populous democracy in the world. India is bounded by the Indian Ocean on the south, the Arabian Sea on the southwest, and the Bay of Bengal on the southeast, it shares land borders with Pakistan to the west;[f] China, Nepal, and Bhutan to the north; and Bangladesh and Myanmar to the east. It is in the vicinity of Sri Lanka and the Maldives; its Andaman and Nicobar Islands share a maritime border with Thailand, Myanmar and Indonesia.",
                "https://www.iitb.ac.in/sites/www.iitb.ac.in/files/styles/full_hd/public/article/images/MB-knowledge-tree.jpg?itok=f_g7DDkd",
                "https://www.jetsetter.com//uploads/sites/7/2018/04/s0i_qgfG-1380x690.jpeg"
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Flag_of_Switzerland.svg/2048px-Flag_of_Switzerland.svg.png",
                "Switzerland",
                "Federal",
                "Switzerland, officially the Swiss Confederation, is a landlocked country located at the confluence of Western, Central and Southern Europe.[f][15] The country is a federal republic composed of 26 cantons, with federal authorities based in Bern.[a][3][2] Switzerland is bordered by Italy to the south, France to the west, Germany to the north and Austria and Liechtenstein to the east. It is geographically divided among the Swiss Plateau, the Alps and the Jura, spanning a total area of 41,285 km2 (15,940 sq mi) and land area of 39,997 km2 (15,443 sq mi). Although the Alps occupy the greater part of the territory, the Swiss population of approximately 8.7 million is concentrated mostly on the plateau, where the largest cities and economic centres are, among them Zürich, Geneva and Basel. These three cities are home to several offices of international organisations such as the WTO, the WHO, the ILO, the headquarters of FIFA, the UN's second-largest office, as well as the main office of the Bank for International Settlements. The main international airports of Switzerland are also located in these cities.",
                "https://smapse.com/storage/2018/09/76b8e2861d54011ae60c91a82e2b86d4-1.jpg",
                "https://www.coe.int/documents/16695/61254353/news-ECRI-Switzerland.jpg/390308c8-b232-5727-4395-120c80429e0d?t=1584611369000"
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/en/thumb/b/be/Flag_of_England.svg/1200px-Flag_of_England.svg.png",
                "England",
                "United Kingdom",
                "England is a country that is part of the United Kingdom.[4] It shares land borders with Wales to its west and Scotland to its north. The Irish Sea lies northwest of England and the Celtic Sea to the southwest. England is separated from continental Europe by the North Sea to the east and the English Channel to the south. The country covers five-eighths of the island of Great Britain, which lies in the North Atlantic, and includes over 100 smaller islands, such as the Isles of Scilly and the Isle of Wight.",
                "https://cdn.britannica.com/03/117103-050-F4C2FC83/view-University-of-Oxford-England-Oxfordshire.jpg",
                "http://cdn.cnn.com/cnnnext/dam/assets/160418164347-beautiful-england-32-stourhead.jpg"
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/en/a/a4/Flag_of_the_United_States.svg",
                "America",
                "United States",
                "The United States of America (U.S.A. or USA), commonly known as the United States (U.S. or US) or America, is a transcontinental country primarily located in North America. It consists of 50 states, a federal district, five major unincorporated territories, nine minor outlying islands,[i] and 326 Indian reservations with limited sovereignty. It is the third-largest country by both land and total area.[c] The United States shares land borders with Canada to the north and with Mexico to the south as well as maritime borders with the Bahamas, Cuba, and Russia, among others.[j] It has a population of over 331 million,[d] and is the third most populous country in the world. The national capital is Washington, D.C., and the most populous city and financial center is New York City. The United States is a melting pot of cultures and ethnicities, and its population has been profoundly shaped by centuries of immigration. It has a highly diverse climate and geography and is officially recognized as one of the 17 ecologically megadiverse countries.",
                "https://www.alisonbrooksarchitects.com/wp-content/uploads/2017/11/Massachusetts-Institute-of-Technology-1200x600.jpg",
                "https://ecophiles.com/wp-content/uploads/2017/09/6026253268_efc4cf9323_o-759x500.jpg"
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Flag_of_Italy.svg/1500px-Flag_of_Italy.svg.png",
                "Italy",
                "Republic",
                "Italy (Italian: Italia [iˈtaːlja] (listen)), officially the Italian Republic or Republic of Italy[12][13] (Italian: Repubblica Italiana [reˈpubblika itaˈljaːna]),[14][15] is a country that consists of a peninsula delimited by the Alps and several islands surrounding it;[note 1] its territory largely coincides with the homonymous geographical region.[16] Italy is located in the middle of the Mediterranean Sea, in Southern Europe;[17][18][19] it is also considered part of Western Europe.[20][note 2] A unitary parliamentary republic with Rome as its capital and largest city, the country covers a total area of 301,230 km2 (116,310 sq mi) and shares land borders with France, Switzerland, Austria, Slovenia, as well as the enclaved microstates of Vatican City and San Marino. Italy has a territorial exclave in Switzerland, Campione. With over 60 million inhabitants,[21] Italy is the third-most populous member state of the European Union.",
                "http://ezapply.ir/sliders/slider_1497795416.jpg",
                "https://cdn.britannica.com/82/195482-050-2373E635/Amalfi-Italy.jpg"
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Flag_of_France.svg/1200px-Flag_of_France.svg.png",
                "France",
                "Republic",
                "France (French: [fʁɑ̃s] Listen), officially the French Republic (French: République française),[14] is a transcontinental country predominantly located in Western Europe and spanning overseas regions and territories in the Americas and the Atlantic, Pacific and Indian Oceans.[XII] Its metropolitan area extends from the Rhine to the Atlantic Ocean and from the Mediterranean Sea to the English Channel and the North Sea; overseas territories include French Guiana in South America, Saint Pierre and Miquelon in the North Atlantic, the French West Indies, and many islands in Oceania and the Indian Ocean. Due to its several coastal territories, France has the largest exclusive economic zone in the world. France borders Belgium, Luxembourg, Germany, Switzerland, Monaco, Italy, Andorra, and Spain in continental Europe, as well as the Netherlands, Suriname, and Brazil in the Americas via its overseas territories in French Guiana and Saint Martin. Its eighteen integral regions (five of which are overseas) span a combined area of 643,801 km2 (248,573 sq mi) and close to 68 million people (as of July 2022).[5][8] France is a unitary semi-presidential republic with its capital in Paris, the country's largest city and main cultural and commercial centre; other major urban areas include Marseille, Lyon, Toulouse, Lille, Bordeaux, and Nice.",
                "https://www.worldatlas.com/r/w1200/upload/85/45/8c/university-of-paris.jpg",
                "https://image.jimcdn.com/app/cms/image/transf/none/path/sa6549607c78f5c11/image/i6de10a2b70b8d17e/version/1586528731/best-nature-wonders-in-france-plateau-de-valensole-copyright-francois-roux-european-best-destinations.jpg"
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_Qatar_%283-2%29.svg/1024px-Flag_of_Qatar_%283-2%29.svg.png",
                "Qatar",
                "Kingdom",
                "Qatar (/ˈkætɑːr/,[10] /ˈkɑːtɑːr/ (listen), /ˈkɑːtər/ or /kəˈtɑːr/ (listen);[11] Arabic: قطر, romanized: Qaṭar [ˈqatˤar]; local vernacular pronunciation: [ˈɡɪtˤɑr]),[12][13] officially the State of Qatar,[a] is a country in Western Asia. It occupies the small Qatar Peninsula on the northeastern coast of the Arabian Peninsula, and shares its sole land border with neighbouring Gulf Cooperation Council monarchy Saudi Arabia to the south, with the rest of its territory surrounded by the Persian Gulf. The Gulf of Bahrain, an inlet of the Persian Gulf, separates Qatar from nearby Bahrain. The capital is Doha, home to over 80% of the nation's population.",
                "http://www.qu.edu.qa/static_file/qu/about/newsroom/Media/2022/August/QU-picture-newsroomm_thumb_320.jpg",
                "https://qatarofw.com/wp-content/uploads/2018/07/QATARS-DESERT-VISIT-QATAR-1.png"
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/1024px-Flag_of_South_Korea.svg.png",
                "South Korea",
                "Republic",
                "South Korea,[b] officially the Republic of Korea (ROK),[c] is a country in East Asia, constituting the southern part of the Korean Peninsula and sharing a land border with North Korea. Its western border is formed by the Yellow Sea, while its eastern border is defined by the Sea of Japan. South Korea claims to be the sole legitimate government of the entire peninsula and adjacent islands. It has a population of 51.75 million, of which roughly half live in the Seoul Capital Area, the fifth largest metropolis in the world. Other major cities include Incheon, Busan, and Daegu.",
                "https://tz-mag-media.s3.ap-southeast-1.amazonaws.com/wp-content/uploads/2018/11/08110153/image25.png",
                "https://en.blog.kkday.com/wp-content/uploads/kr_jirisan.jpg"
            ),
            CountriesItem(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Flag_of_Georgia.svg/2560px-Flag_of_Georgia.svg.png",
                "Georgia",
                "Republic",
                "Georgia (Georgian: საქართველო, romanized: Sakartvelo; IPA: [sɑkʰɑrtʰvɛlɔ] (listen)) is a country located in the Caucasus, at the intersection of Eastern Europe and Western Asia. It is bounded by the Black Sea to the west, by Russia to the north and east, by Turkey to the southwest, by Armenia to the south, and by Azerbaijan to the southeast. The country covers an area of 69,700 square kilometres (26,900 sq mi), and has a population of 3.7 million people (excluding the Russian-occupied Georgian territories).[10] Georgia is a representative democracy governed as a unitary parliamentary republic.[11][12] Tbilisi is its capital as well as its largest city, and is home to roughly a third of the Georgian population.",
                "http://www.reinisfischer.com/sites/default/files/campus.jpg",
                "https://ejoi2020.ge/static/assets/images/gergeti.jpg"
            )
        )

        val myAdapter = HomeAdapter(data)

        binding.recyclerHome.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        binding.recyclerHome.adapter = myAdapter

    }
}