@RestController
@RequestMapping("/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @PostMapping("/add")
    public Expense add(@RequestBody Expense expense) {
        return service.addExpense(expense);
    }

    @GetMapping("/list")
    public List<Expense> list(@RequestParam Long userId) {
        return service.getExpenses(userId);
    }
}