@RestController
@RequestMapping("/compatibility")
public class CompatibilityController {

    private final CompatibilityService service;

    public CompatibilityController(CompatibilityService service) {
        this.service = service;
    }

    @GetMapping("/{score}")
    public String level(@PathVariable int score) {
        return service.level(score);
    }
}
