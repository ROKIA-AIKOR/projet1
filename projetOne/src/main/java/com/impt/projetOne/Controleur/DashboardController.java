package com.impt.projetOne.Controleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard"; // Return the dashboard.html Thymeleaf template
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin"; // Return the admin.html Thymeleaf template
    }
}
