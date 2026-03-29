@RestController
@RequestMapping("/income")
public class IncomeController {

    @Autowired
    private IncomeService service;

    @PostMapping("/add")
    public Income add(@RequestBody Income income) {
        return service.addIncome(income);
    }

    @GetMapping("/list")
    public List<Income> list(@RequestParam Long userId) {
        return service.getIncome(userId);
    }
}