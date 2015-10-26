import redis.clients.jedis.Jedis;

public class SimpleRedis {

	public static void main(String[] args) {
		Jedis jedis = null;
		try {
			jedis = new Jedis("192.168.99.100");
		jedis.set("key", "value");
		System.out.println(jedis.get("key"));
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}
	}

}
