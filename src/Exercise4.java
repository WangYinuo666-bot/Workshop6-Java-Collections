/*
 * Workshop 6 - Exercise 4 (Easy)
 * Decode the coded message "G tgsl Qefe." using the given substitution table.
 *
 *   a->c  b->r  c->g  d->z  e->a  f->v  g->i  h->b  i->s  j->d  k->o  l->e  m->q
 *   n->f  o->h  p->u  q->j  r->x  s->k  t->l  u->w  v->m  w->y  x->n  y->p  z->t
 *
 * To decode a different message just change the CODED_MESSAGE constant
 * (or pass the message as a command line argument).
 */
public class Exercise4 {

    // the coded letters, in alphabet order  (a b c ... z)
    private static final char[] CODE  = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    // the letters they decode to  (c r g z a v i b s d o e q f h u j x l w m y n p t)
    private static final char[] PLAIN = "crgzavibsdoeqfhujxklwmynpt".toCharArray();

    private static final String CODED_MESSAGE = "G tgsl Qefe.";

    public static void main(String[] args) {

        String coded = (args.length > 0) ? args[0] : CODED_MESSAGE;

        System.out.println("Coded message   : " + coded);
        System.out.println("Decoded message : " + decode(coded));
    }

    public static String decode(String message) {

        char[] input = message.toCharArray();
        char[] output = new char[input.length];

        for (int i = 0; i < input.length; i++) {

            char c = input[i];
            char lower = Character.toLowerCase(c);

            int position = -1;
            for (int k = 0; k < CODE.length; k++) {
                if (CODE[k] == lower) {
                    position = k;
                    break;
                }
            }

            if (position == -1) {
                // space, full stop or any other character: copy it unchanged
                output[i] = c;
            } else {
                char decoded = PLAIN[position];
                // keep the original case: 'G' -> 'I', 'g' -> 'i'
                output[i] = Character.isUpperCase(c) ? Character.toUpperCase(decoded) : decoded;
            }
        }
        return new String(output);
    }
}
