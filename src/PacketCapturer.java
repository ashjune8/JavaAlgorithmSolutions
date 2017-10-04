
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.awt.EventQueue;


import org.jnetpcap.Pcap;
import org.jnetpcap.nio.JMemory;
import org.jnetpcap.packet.JFlow;
import org.jnetpcap.packet.JFlowKey;
import org.jnetpcap.packet.JFlowMap;
import org.jnetpcap.packet.JPacket;
import org.jnetpcap.packet.JPacketHandler;
import org.jnetpcap.packet.JScanner;
import org.jnetpcap.packet.Payload;
import org.jnetpcap.packet.PcapPacket;
import org.jnetpcap.protocol.tcpip.Http;
import org.jnetpcap.protocol.tcpip.Tcp;

public class PacketCapturer {


    public static void main(String[] args) {
//		AppWindow window = new AppWindow();
//		
//		       try {
//		          
//		          window.frame.setVisible(true);
//		        } catch (Exception e) {
//		          e.printStackTrace();
//		        }
		    
		   
		/*
		 * Example #1 open offline capture file for reading packets.
		 */
        final String FILENAME = "C:/Users/Ashutosh/Downloads/Lab 1/Lab 1/httpsession.pcap";
        final StringBuilder errbuf = new StringBuilder();

        final Pcap pcap = Pcap.openOffline(FILENAME, errbuf);
        if (pcap == null) {
            System.err.println(errbuf); // Error is stored in errbuf if any
            return;
        }

        pcap.loop(Pcap.LOOP_INFINITE, new JPacketHandler<StringBuilder>() {

            final Tcp tcp = new Tcp();

            final Http http = new Http();
            final Payload payload = new Payload();

            public void nextPacket(JPacket packet, StringBuilder errbuf) {

                if (packet.hasHeader(Tcp.ID)) {

                    packet.getHeader(tcp);

                    System.out.printf("tcp.dst_port=%d%n", tcp.destination());
                    System.out.printf("tcp.src_port=%d%n", tcp.source());
                    System.out.printf("tcp.ack=%x%n", tcp.ack());
                    // System.out.printf("tcp header::%s%n", tcp.toString());

                }
                if (packet.hasHeader(payload)) {
                    //byte[] payloadContent=payload.getByteArray(0, payload.size());
                    String strPayload=payload.getUTF8String(0, payload.size());
                    if(!strPayload.isEmpty()){
                        System.out.println("--Packet Payload--");
                        System.out.println(strPayload);
                    }
                }


                // if (packet.hasHeader(tcp)) {
                // System.out.printf("tcp header::%s%n", tcp.toString());
                // }

				/*
				 * A typical and common approach to getting headers from a
				 * packet is to chain them as a condition for the if statement.
				 * If we need to work with both tcp and http headers, for
				 * example, we place both of them on the command line.
				 */
                if (packet.hasHeader(tcp) && packet.hasHeader(http)) {
					/*
					 * Now we are guarranteed to have both tcp and http header
					 * peered. If the packet only contained tcp segment even
					 * though tcp may have http port number, it still won't show
					 * up here since headers appear right at the beginning of
					 * http session.
					 */

                    System.out.printf("http header::%s%n", http);

					/*
					 * jNetPcap keeps track of frame numbers for us. The number
					 * is simply incremented with every packet scanned.
					 */

                }

                System.out.printf("frame #%d%n", packet.getFrameNumber());
            }

        }, errbuf);

		/*
		 * Now that we have captured our 10 packets, lets use Pcap.nextEx to get
		 * the next 5 packets. We will also reset the frame number back to 0
		 * just so we can see how its done. Each scanner keeps track of its own
		 * frame numbers, so we want to get the default one, for this thread,
		 * and change it there.
		 */
        // JScanner.getThreadLocal().setFrameNumber(0);
        //
        // final PcapPacket packet = new PcapPacket(JMemory.POINTER);
        // final Tcp tcp = new Tcp();
        //
        // for (int i = 0; i < 5; i++) {
        // pcap.nextEx(packet);
        //
        // if (packet.hasHeader(tcp)) {
        // System.out.printf("#%d seq=%08X%n", packet.getFrameNumber(),
        // tcp.seq());
        // }
        // }

		/*
		 * Each packet scanned, also has a flow key associated with it. The flow
		 * key is generated based on the headers in each packet and stored with
		 * packet state. We can use the flow key to uniquely identify packets
		 * belonging to the same stream of packets between end host systems. We
		 * will keep a map of various flows with packets in it.
		 */
        // final Map<JFlowKey, JFlow> flows = new HashMap<JFlowKey, JFlow>();
        //
        // for (int i = 0; i < 50; i++) {
        // pcap.nextEx(packet);
        // final JFlowKey key = packet.getState().getFlowKey();

		/*
		 * A hashmap uses the equals method to determine if a key is already
		 * present in the map or not and to retrieve values. jNetPcap provides
		 * us with a special object called a JFlow which keeps a list of packets
		 * part of that flow. We can add new packets to a flow and later we can
		 * get a list of those packets. So first we check if a flow for a given
		 * key already exists. All packets part of the same flow will have the
		 * same key.
		 */
        // JFlow flow = flows.get(key);
        // if (flow == null) {
        // flows.put(key, flow = new JFlow(key));
        // }

		/*
		 * Now that we know for sure we have a flow this packet belongs to, we
		 * can add this packet to this flow. Before we can actuall add a packet
		 * to a queue for later processing, we must first make a copy of the
		 * packet to a new object. We can only process each libpcap packet
		 * immediately before any other calls or nextEx or another iteration of
		 * a loop. The packets are delivered to us without copies so what we are
		 * working with is the data within libpcap buffer. If we want to
		 * preserve a packet beyond this point, we have to make a copy of the
		 * packet and its decoded state and then we can keep the packet around
		 * for as long as its needed. There is a convenience PcapPacket
		 * constructor that does a copy of everything needed for us.
		 */
        // flow.add(new PcapPacket(packet));
        // }

		/*
		 * Now that we added 50 packets to various flows maintained by the flows
		 * Map, we can now access those flows and the packet within it. The
		 * packets are now grouped into flows.
		 */

        // for (JFlow flow : flows.values()) {
        //
        //
        // if (flow.isReversable()) {
        //
        //
        // List<JPacket> forward = flow.getForward();
        // for (JPacket p : forward) {
        // System.out.printf("%d, ", p.getFrameNumber());
        // }
        // System.out.println();
        //
        // List<JPacket> reverse = flow.getReverse();
        // for (JPacket p : reverse) {
        // System.out.printf("%d, ", p.getFrameNumber());
        // }
        // } else {
        //
        //
        // for (JPacket p : flow.getAll()) {
        // System.out.printf("%d, ", p.getFrameNumber());
        // }
        // }
        // System.out.println();
        // }

		/*
		 * We still haven't read all the packets from our offline file. Here is
		 * an easier way to retrieve all the packets while grouping them into
		 * flows. jNetPcap provides a neat little class that does all of the
		 * above work for us. Its called JFlowMap, not only that it implements a
		 * JPacketHandler interface suitable for usage with Pcap.loop or
		 * Pcap.dispatch calls and it will add all packets received into
		 * appropriate flows.
		 */
        // JFlowMap superFlowMap = new JFlowMap();

		/*
		 * So lets finish this file off, and read the remaining packets into our
		 * new superFlowMap and do a pretty print of all the flows it finds. The
		 * 3rd argument to Pcap.loop is unused so we just set it to null.
		 * Pcap.LOOP_INFINITE flag tells the Pcap.loop method to read all the
		 * packets until the end of file. Since we already read some packets,
		 * this will read remaining packets from the current position in the
		 * file until the end.
		 */
        // pcap.loop(Pcap.LOOP_INFINITE, superFlowMap, null);

        // System.out.printf("superFlowMap::%s%n", superFlowMap);

		/*
		 * Now we have read the remaining packets and we no longer need to keep
		 * the pcap file open.
		 */
        pcap.close();

    }
}
