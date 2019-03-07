package tp3_SirRegis;

import redis.clients.jedis.Jedis;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Jedis jedis = new Jedis("localhost");
		jedis.set("foo", "bar");
		String value = jedis.get("foo");
		
		System.err.println(value);

	}

}
