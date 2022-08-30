package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiseImpl;

@Controller
public class CarController {
    CarService carService = new CarServiseImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {

        if (count == null) count = 0;
        model.addAttribute("cars", carService.getCars(count));
        return "/cars";
    }

}