@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletService service;

    @PostMapping("/create")
    public Wallet create(@RequestParam Long userId) {
        return service.createWallet(userId);
    }

    @PostMapping("/add")
    public Wallet addMoney(@RequestParam Long userId,
                           @RequestParam double amount) {
        return service.addMoney(userId, amount);
    }
}