// An Applet skeleton.
import java.awt.*;
import java.applet.*;
/*
<applet code="applet1" width=300 height=100>
</applet>
*/
public class applet1 extends Applet {
// Called first.
//public void init() {
// initialization
//}
/* Called second, after init().
the applet is restarted. */
//public void start() {
// start or resume execution
//}
// Also called whenever
// Called when the applet is stopped.
//public void stop() {
// suspends execution
//}
/* Called when applet is terminated.
method executed. */
//public void destroy() {
// perform shutdown activities
//}
// This is the last
// Called when an applet’s window must be restored.
public void paint(Graphics g) {
// redisplay contents of window
	g.drawString ("Hello", 10, 20);
}
}