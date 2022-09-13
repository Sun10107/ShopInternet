package com.overane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
    @Autowired
    private ClientShopRepository clientShopRepository;
    @Autowired
    private CartRepositori cartRepositori;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @RequestMapping(value = "/process_register", method = RequestMethod.POST)
    public String register(@ModelAttribute(name = "client") final ClientShop clientShop) {
        String password = clientShop.getPassword();
        clientShop.setPassword(bCryptPasswordEncoder.encode(password));
        Cart cart = new Cart();
        cartRepositori.save(cart);
        clientShop.setCart(cart);
        clientShopRepository.save(clientShop);
        return "redirect:/";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String showRegistrationForm(final Model model) {
        model.addAttribute("clientShop", new ClientShop());
        return "registration";
    }

}
