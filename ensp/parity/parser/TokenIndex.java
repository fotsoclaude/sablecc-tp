/* This file was generated by SableCC (http://www.sablecc.org/). */

package ensp.parity.parser;

import ensp.parity.node.*;
import ensp.parity.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTA(@SuppressWarnings("unused") TA node)
    {
        this.index = 0;
    }

    @Override
    public void caseTB(@SuppressWarnings("unused") TB node)
    {
        this.index = 1;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 2;
    }
}
