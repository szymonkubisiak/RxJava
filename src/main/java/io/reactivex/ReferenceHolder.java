
package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public interface ReferenceHolder {

    /**
     * Provides the ReferenceHolder with upstream reference
     * to prevent the connection from being garbage collected
     * @param o an object that ReferenceHolder is obligated to tie permanently
     *          to its own lifetime (that is: store in a member)
     */
    void holdReference(Object o);
}