
import redis.clients.jedis.*;

// A single Jedis instance is not thread-safe! JedisPool is thread-safe.
public class SimpleJedisPool {

	public static void main(String[] args) {
		JedisPool pool = new JedisPool(new JedisPoolConfig(), "192.168.99.100");
		
		try (Jedis jedis = pool.getResource()) {

		  jedis.set("key", "value");
		  System.out.println (jedis.get("key"));
		}
		// Jedis instance will be auto-closed after the last statement.
		
		// ... when closing your application:
		pool.destroy();
	}

}
