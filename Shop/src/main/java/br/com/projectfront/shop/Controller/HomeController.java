package br.com.projectfront.demo.Controller;

import br.com.projectfront.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Order order = new Order();
        order.setNameProduct("Action figures of Demon Slayer");
        order.setUrlImage("https://cf.shopee.com.br/file/ee98d59b24ef56bed92ae67580fbc58a");
        order.setUrlProduct("https://shopee.com.br/Kit-de-Boneco-de-PVC-do-Anime-Demon-Slayer-Kimetsu-no-Yaiba-Boneco-da-Tanjiro-Nezuko-Personagem-Q-Posket-Colecion%C3%A1vel-i.250397894.3935261020");
        order.setDescription("Kimetsu no Yaiba/ Nezuko");

        List<Order> orders = Arrays.asList(order);
        model.addAttribute("orders", orders);
        return "home";
    }

}
