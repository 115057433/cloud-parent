//package cc.rule.nn;
//
//
//import java.util.List;
//import java.util.Random;
//
//import com.netflix.client.config.IClientConfig;
//import com.netflix.loadbalancer.AbstractLoadBalancerRule;
//import com.netflix.loadbalancer.ILoadBalancer;
//import com.netflix.loadbalancer.Server;
//
//public class CloudBalenceRule extends AbstractLoadBalancerRule{
//
//	public Server choose(ILoadBalancer lb,Object key) {
//		if(lb == null) {
//			return null;
//		}
//		Server server = null;
//		while (server == null) {
//			if(Thread.interrupted()) {
//				return null;
//			}
//			List<Server>upList = lb.getReachableServers();
//			List<Server>allList = lb.getAllServers();
//			
//			int serverCount = allList.size();
//			if(serverCount == 0) {
//				return null;
//			}
//			
//			int index = rand.nextInt(serverCount);
//			server = upList.get(index);
//			if(server == null) {
//				Thread.yield();
//				continue;
//			}
//			if(server.isAlive()) {
//				return server;
//			}
//			return server;
//		}
//		
//	}
//	
//	@Override
//	public Server choose(Object key) {
//		// TODO Auto-generated method stub
//		return choose(getLoadBalancer(),key);
//	}
//
//	@Override
//	public void initWithNiwsConfig(IClientConfig clientConfig) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
