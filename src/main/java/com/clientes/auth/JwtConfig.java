package com.clientes.auth;

public class JwtConfig {
	public static final String SECRET_KEY = "&7Bjl4Fug.6Ywh2Mkr%2Vtu6Qd.y4Ugb0Zi#";
	
	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\n"
			+ "MIIEogIBAAKCAQEA7kLPMWlIORaHsPBHILS6pYFqAg8kDL8Nm3TRJ84z6LOHrxrG\n"
			+ "9bGbBEhR9WVyK40QYGrCMbh6mcho+7rOpaiYvJfNPRD4op7ryhYOWyQDFdS/FXyT\n"
			+ "ZQgfABZu+aOfA9pu/8yRZcUAqaofTcdKLmgtNpsviEW71piI2zyM9FgwxAyqfEcX\n"
			+ "XcQq7sqbD6P2Tq/lns7qwjptviBH4GEtzkMe483uns0b67/9UkNE6KdwTzvfwQOY\n"
			+ "cypeOwZYZuJ17jT4Nx1sUpvKuZxZ3IXlnt4DJTdhCUnrSC0hnDCey9RAX6DQxiYo\n"
			+ "Q7ww0+gIADvRJT1O7othERW3z6nPyzLVLUGvgwIDAQABAoIBADOHo4QOPx6JruMn\n"
			+ "tFpwfAWbja/QUn2nPGwowauYP0XOvkOyyOEOfnZYpdErFZwxsB8KN+HFAk8MNxhq\n"
			+ "eJL/ebkgI7VXXE7fjCNyzbwMd9Za4tDk1oP9U6cTMwEu0A9nSKZuOewGxXPsZUTP\n"
			+ "G04aHd03hvo0CsIIz2CLIfkesb1UjR2ZkZgxvTHce5k0wMvKGaRxO+3Hp2UOPYiZ\n"
			+ "xLaHmDoztKa/TiNN1jPngZLwJbZyw/p1TVZsGzutqG8iFkUvdJsoyV/19/2jMFk/\n"
			+ "t7m6S9C800My8M7HePxuR5Pz/AKChyBcAgo9GooY/Gl7+JuFudY9FCcPf+ylU3/3\n"
			+ "JKPqFwECgYEA+Qb6eq6x6y5ZAKWJ2WkzURk5MPoUwAil8UaPVSooGD7LLo7ytoZt\n"
			+ "5u2TAuGTqvfraAuaqTblHcah+N2A9bjKKw4Tw8R5r+XqO8zuvhpDK8LRrs1aUGiP\n"
			+ "sqWKzzad9sAu78snaeSS/t/a1c1jEIA92ZhczcS1nSmTUM+FWUOSbkECgYEA9O6o\n"
			+ "juzszRHxIBLAYnVh5Vqn0P2B80SaCw22lg/adh9JWrGuvn+6BU/jILb2bXr+pHp4\n"
			+ "lEi06Z6/Zll5GX1OTfZCr6hn928cB146Vo85dqEz4iHQ1Bi4NFajbTeXKzLjF97f\n"
			+ "Dphk9roVYv3ZHLGZPklgx0/r89nBrYWLqZaytMMCgYAKXaf/g1YUnBFIXZunWSGx\n"
			+ "toMS7tX+SF3f9TfyK5cPq0152qlvv5jDjBAahplG/Jrn8dO2R3qyCpqjaVT85XxE\n"
			+ "3okkFQGbuM5PPvCRKTayk6F2zUV9I10X6pwkk/lvVACgKqyxU7pqsZbCX5JIFY59\n"
			+ "iEIUrqOAr0JaksjSNmXaAQKBgBsYc8kr6J5fB7+2k1XRCn1m4/24rbGNu0TRxYsg\n"
			+ "QdijaWgBFAW694cy6TtrQiOmYZksez5cNLdLen0GFOF+/TSes43fIXE792vRPr7o\n"
			+ "pUC8YJL5jrKH8YjItNeWOMDspjazzxU8Qp8QwuDqmCQWeY9saqph6wZU5podle+y\n"
			+ "3h4lAoGATPQB49Jyk92wMU7O5X5gYaOsVJUqxDOOT4gRI5NJqQ5D3RGmPv01X6oB\n"
			+ "cGULmvv2K/mX6Phiiez1fRU/+VhJqfNleewomGwcKTNSFw0by5nUQe53hWe3HZ7i\n"
			+ "ve4/WBhKiWiXwcsbuQveh4Xqr1RUrKGp7+2tRs0e7xwkh+cgG30=\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7kLPMWlIORaHsPBHILS6\n"
			+ "pYFqAg8kDL8Nm3TRJ84z6LOHrxrG9bGbBEhR9WVyK40QYGrCMbh6mcho+7rOpaiY\n"
			+ "vJfNPRD4op7ryhYOWyQDFdS/FXyTZQgfABZu+aOfA9pu/8yRZcUAqaofTcdKLmgt\n"
			+ "NpsviEW71piI2zyM9FgwxAyqfEcXXcQq7sqbD6P2Tq/lns7qwjptviBH4GEtzkMe\n"
			+ "483uns0b67/9UkNE6KdwTzvfwQOYcypeOwZYZuJ17jT4Nx1sUpvKuZxZ3IXlnt4D\n"
			+ "JTdhCUnrSC0hnDCey9RAX6DQxiYoQ7ww0+gIADvRJT1O7othERW3z6nPyzLVLUGv\n"
			+ "gwIDAQAB\n"
			+ "-----END PUBLIC KEY-----";
}
