.class public final Ll/f;
.super Ll/t;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final A:Li1/a;

.field public B:I

.field public C:I

.field public D:Landroid/view/View;

.field public E:Landroid/view/View;

.field public F:I

.field public G:Z

.field public H:Z

.field public I:I

.field public J:I

.field public K:Z

.field public L:Z

.field public M:Ll/w;

.field public N:Landroid/view/ViewTreeObserver;

.field public O:Landroid/widget/PopupWindow$OnDismissListener;

.field public P:Z

.field public final r:Landroid/content/Context;

.field public final s:I

.field public final t:I

.field public final u:Z

.field public final v:Landroid/os/Handler;

.field public final w:Ljava/util/ArrayList;

.field public final x:Ljava/util/ArrayList;

.field public final y:Ll/d;

.field public final z:LC0/D;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ll/f;->w:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ll/f;->x:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ll/d;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1, p0}, Ll/d;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ll/f;->y:Ll/d;

    .line 25
    .line 26
    new-instance v0, LC0/D;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-direct {v0, v1, p0}, LC0/D;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Ll/f;->z:LC0/D;

    .line 33
    .line 34
    new-instance v0, Li1/a;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-direct {v0, v1, p0}, Li1/a;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Ll/f;->A:Li1/a;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iput v0, p0, Ll/f;->B:I

    .line 44
    .line 45
    iput v0, p0, Ll/f;->C:I

    .line 46
    .line 47
    iput-object p1, p0, Ll/f;->r:Landroid/content/Context;

    .line 48
    .line 49
    iput-object p2, p0, Ll/f;->D:Landroid/view/View;

    .line 50
    .line 51
    iput p3, p0, Ll/f;->t:I

    .line 52
    .line 53
    iput-boolean p4, p0, Ll/f;->u:Z

    .line 54
    .line 55
    iput-boolean v0, p0, Ll/f;->K:Z

    .line 56
    .line 57
    invoke-virtual {p2}, Landroid/view/View;->getLayoutDirection()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/4 p3, 0x1

    .line 62
    if-ne p2, p3, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move v0, p3

    .line 66
    :goto_0
    iput v0, p0, Ll/f;->F:I

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 77
    .line 78
    div-int/lit8 p2, p2, 0x2

    .line 79
    .line 80
    const p3, 0x7f060017

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iput p1, p0, Ll/f;->s:I

    .line 92
    .line 93
    new-instance p1, Landroid/os/Handler;

    .line 94
    .line 95
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, Ll/f;->v:Landroid/os/Handler;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ll/f;->x:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ll/e;

    .line 15
    .line 16
    iget-object v0, v0, Ll/e;->a:Lm/H0;

    .line 17
    .line 18
    iget-object v0, v0, Lm/C0;->P:Lm/y;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    return v2
.end method

.method public final b(Ll/l;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Ll/f;->x:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ll/e;

    .line 16
    .line 17
    iget-object v4, v4, Ll/e;->b:Ll/l;

    .line 18
    .line 19
    if-ne p1, v4, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v3, -0x1

    .line 26
    :goto_1
    if-gez v3, :cond_2

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_2
    add-int/lit8 v1, v3, 0x1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ge v1, v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ll/e;

    .line 43
    .line 44
    iget-object v1, v1, Ll/e;->b:Ll/l;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ll/l;->c(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ll/e;

    .line 54
    .line 55
    iget-object v3, v1, Ll/e;->b:Ll/l;

    .line 56
    .line 57
    iget-object v1, v1, Ll/e;->a:Lm/H0;

    .line 58
    .line 59
    invoke-virtual {v3, p0}, Ll/l;->r(Ll/x;)V

    .line 60
    .line 61
    .line 62
    iget-boolean v3, p0, Ll/f;->P:Z

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    iget-object v3, v1, Lm/C0;->P:Lm/y;

    .line 68
    .line 69
    invoke-static {v3, v4}, Lm/E0;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, v1, Lm/C0;->P:Lm/y;

    .line 73
    .line 74
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-virtual {v1}, Lm/C0;->dismiss()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/4 v3, 0x1

    .line 85
    if-lez v1, :cond_5

    .line 86
    .line 87
    add-int/lit8 v5, v1, -0x1

    .line 88
    .line 89
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ll/e;

    .line 94
    .line 95
    iget v5, v5, Ll/e;->c:I

    .line 96
    .line 97
    iput v5, p0, Ll/f;->F:I

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    iget-object v5, p0, Ll/f;->D:Landroid/view/View;

    .line 101
    .line 102
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-ne v5, v3, :cond_6

    .line 107
    .line 108
    move v5, v2

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    move v5, v3

    .line 111
    :goto_2
    iput v5, p0, Ll/f;->F:I

    .line 112
    .line 113
    :goto_3
    if-nez v1, :cond_a

    .line 114
    .line 115
    invoke-virtual {p0}, Ll/f;->dismiss()V

    .line 116
    .line 117
    .line 118
    iget-object p2, p0, Ll/f;->M:Ll/w;

    .line 119
    .line 120
    if-eqz p2, :cond_7

    .line 121
    .line 122
    invoke-interface {p2, p1, v3}, Ll/w;->b(Ll/l;Z)V

    .line 123
    .line 124
    .line 125
    :cond_7
    iget-object p1, p0, Ll/f;->N:Landroid/view/ViewTreeObserver;

    .line 126
    .line 127
    if-eqz p1, :cond_9

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_8

    .line 134
    .line 135
    iget-object p1, p0, Ll/f;->N:Landroid/view/ViewTreeObserver;

    .line 136
    .line 137
    iget-object p2, p0, Ll/f;->y:Ll/d;

    .line 138
    .line 139
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 140
    .line 141
    .line 142
    :cond_8
    iput-object v4, p0, Ll/f;->N:Landroid/view/ViewTreeObserver;

    .line 143
    .line 144
    :cond_9
    iget-object p1, p0, Ll/f;->E:Landroid/view/View;

    .line 145
    .line 146
    iget-object p2, p0, Ll/f;->z:LC0/D;

    .line 147
    .line 148
    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Ll/f;->O:Landroid/widget/PopupWindow$OnDismissListener;

    .line 152
    .line 153
    invoke-interface {p1}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_a
    if-eqz p2, :cond_b

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    check-cast p1, Ll/e;

    .line 164
    .line 165
    iget-object p1, p1, Ll/e;->b:Ll/l;

    .line 166
    .line 167
    invoke-virtual {p1, v2}, Ll/l;->c(Z)V

    .line 168
    .line 169
    .line 170
    :cond_b
    :goto_4
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ll/f;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Ll/f;->w:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    check-cast v4, Ll/l;

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Ll/f;->w(Ll/l;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ll/f;->D:Landroid/view/View;

    .line 34
    .line 35
    iput-object v0, p0, Ll/f;->E:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Ll/f;->N:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Ll/f;->N:Landroid/view/ViewTreeObserver;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, Ll/f;->y:Ll/d;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Ll/f;->E:Landroid/view/View;

    .line 58
    .line 59
    iget-object v1, p0, Ll/f;->z:LC0/D;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_1
    return-void
.end method

.method public final d(Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final dismiss()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll/f;->x:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    new-array v2, v1, [Ll/e;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Ll/e;

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v1, :cond_1

    .line 20
    .line 21
    aget-object v2, v0, v1

    .line 22
    .line 23
    iget-object v3, v2, Ll/e;->a:Lm/H0;

    .line 24
    .line 25
    iget-object v3, v3, Lm/C0;->P:Lm/y;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, Ll/e;->a:Lm/H0;

    .line 34
    .line 35
    invoke-virtual {v2}, Lm/C0;->dismiss()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final e()Lm/p0;
    .locals 2

    .line 1
    iget-object v0, p0, Ll/f;->x:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ll/e;

    .line 22
    .line 23
    iget-object v0, v0, Ll/e;->a:Lm/H0;

    .line 24
    .line 25
    iget-object v0, v0, Lm/C0;->s:Lm/p0;

    .line 26
    .line 27
    return-object v0
.end method

.method public final f(Ll/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll/f;->M:Ll/w;

    .line 2
    .line 3
    return-void
.end method

.method public final h(Z)V
    .locals 4

    .line 1
    iget-object p1, p0, Ll/f;->x:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    check-cast v2, Ll/e;

    .line 17
    .line 18
    iget-object v2, v2, Ll/e;->a:Lm/H0;

    .line 19
    .line 20
    iget-object v2, v2, Lm/C0;->s:Lm/p0;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    instance-of v3, v2, Landroid/widget/HeaderViewListAdapter;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    check-cast v2, Landroid/widget/HeaderViewListAdapter;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ll/i;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    check-cast v2, Ll/i;

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v2}, Ll/i;->notifyDataSetChanged()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

.method public final j()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k()Landroid/os/Parcelable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final l(Ll/D;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Ll/f;->x:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :cond_0
    const/4 v4, 0x1

    .line 10
    if-ge v3, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    check-cast v5, Ll/e;

    .line 19
    .line 20
    iget-object v6, v5, Ll/e;->b:Ll/l;

    .line 21
    .line 22
    if-ne p1, v6, :cond_0

    .line 23
    .line 24
    iget-object p1, v5, Ll/e;->a:Lm/H0;

    .line 25
    .line 26
    iget-object p1, p1, Lm/C0;->s:Lm/p0;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    return v4

    .line 32
    :cond_1
    invoke-virtual {p1}, Ll/l;->hasVisibleItems()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ll/f;->n(Ll/l;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Ll/f;->M:Ll/w;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0, p1}, Ll/w;->g(Ll/l;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    return v4

    .line 49
    :cond_3
    return v2
.end method

.method public final n(Ll/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/f;->r:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1, p0, v0}, Ll/l;->b(Ll/x;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ll/f;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ll/f;->w(Ll/l;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Ll/f;->w:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onDismiss()V
    .locals 6

    .line 1
    iget-object v0, p0, Ll/f;->x:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ll/e;

    .line 16
    .line 17
    iget-object v5, v4, Ll/e;->a:Lm/H0;

    .line 18
    .line 19
    iget-object v5, v5, Lm/C0;->P:Lm/y;

    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v0, v4, Ll/e;->b:Ll/l;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ll/l;->c(Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x52

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ll/f;->dismiss()V

    .line 13
    .line 14
    .line 15
    return p3

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final p(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll/f;->D:Landroid/view/View;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Ll/f;->D:Landroid/view/View;

    .line 6
    .line 7
    iget v0, p0, Ll/f;->B:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Ll/f;->C:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final q(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ll/f;->K:Z

    .line 2
    .line 3
    return-void
.end method

.method public final r(I)V
    .locals 1

    .line 1
    iget v0, p0, Ll/f;->B:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ll/f;->B:I

    .line 6
    .line 7
    iget-object v0, p0, Ll/f;->D:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Ll/f;->C:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final s(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll/f;->G:Z

    .line 3
    .line 4
    iput p1, p0, Ll/f;->I:I

    .line 5
    .line 6
    return-void
.end method

.method public final t(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll/f;->O:Landroid/widget/PopupWindow$OnDismissListener;

    .line 2
    .line 3
    return-void
.end method

.method public final u(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ll/f;->L:Z

    .line 2
    .line 3
    return-void
.end method

.method public final v(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll/f;->H:Z

    .line 3
    .line 4
    iput p1, p0, Ll/f;->J:I

    .line 5
    .line 6
    return-void
.end method

.method public final w(Ll/l;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ll/f;->r:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Ll/i;

    .line 12
    .line 13
    iget-boolean v5, v0, Ll/f;->u:Z

    .line 14
    .line 15
    const v6, 0x7f0c000b

    .line 16
    .line 17
    .line 18
    invoke-direct {v4, v1, v3, v5, v6}, Ll/i;-><init>(Ll/l;Landroid/view/LayoutInflater;ZI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ll/f;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, 0x1

    .line 26
    const/4 v7, 0x0

    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    iget-boolean v5, v0, Ll/f;->K:Z

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    iput-boolean v6, v4, Ll/i;->c:Z

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-virtual {v0}, Ll/f;->a()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    iget-object v5, v1, Ll/l;->f:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    move v8, v7

    .line 49
    :goto_0
    if-ge v8, v5, :cond_2

    .line 50
    .line 51
    invoke-virtual {v1, v8}, Ll/l;->getItem(I)Landroid/view/MenuItem;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-interface {v9}, Landroid/view/MenuItem;->isVisible()Z

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    if-eqz v10, :cond_1

    .line 60
    .line 61
    invoke-interface {v9}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    if-eqz v9, :cond_1

    .line 66
    .line 67
    move v5, v6

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    move v5, v7

    .line 73
    :goto_1
    iput-boolean v5, v4, Ll/i;->c:Z

    .line 74
    .line 75
    :cond_3
    :goto_2
    iget v5, v0, Ll/f;->s:I

    .line 76
    .line 77
    invoke-static {v4, v2, v5}, Ll/t;->o(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    new-instance v8, Lm/H0;

    .line 82
    .line 83
    iget v9, v0, Ll/f;->t:I

    .line 84
    .line 85
    const/4 v10, 0x0

    .line 86
    invoke-direct {v8, v2, v10, v9, v7}, Lm/C0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v0, Ll/f;->A:Li1/a;

    .line 90
    .line 91
    iput-object v2, v8, Lm/H0;->S:Li1/a;

    .line 92
    .line 93
    iput-object v0, v8, Lm/C0;->F:Landroid/widget/AdapterView$OnItemClickListener;

    .line 94
    .line 95
    iget-object v2, v8, Lm/C0;->P:Lm/y;

    .line 96
    .line 97
    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 98
    .line 99
    .line 100
    iget-object v2, v0, Ll/f;->D:Landroid/view/View;

    .line 101
    .line 102
    iput-object v2, v8, Lm/C0;->E:Landroid/view/View;

    .line 103
    .line 104
    iget v2, v0, Ll/f;->C:I

    .line 105
    .line 106
    iput v2, v8, Lm/C0;->B:I

    .line 107
    .line 108
    iput-boolean v6, v8, Lm/C0;->O:Z

    .line 109
    .line 110
    iget-object v2, v8, Lm/C0;->P:Lm/y;

    .line 111
    .line 112
    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 113
    .line 114
    .line 115
    iget-object v2, v8, Lm/C0;->P:Lm/y;

    .line 116
    .line 117
    const/4 v9, 0x2

    .line 118
    invoke-virtual {v2, v9}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8, v4}, Lm/C0;->p(Landroid/widget/ListAdapter;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8, v5}, Lm/C0;->r(I)V

    .line 125
    .line 126
    .line 127
    iget v2, v0, Ll/f;->C:I

    .line 128
    .line 129
    iput v2, v8, Lm/C0;->B:I

    .line 130
    .line 131
    iget-object v2, v0, Ll/f;->x:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-lez v4, :cond_c

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    sub-int/2addr v4, v6

    .line 144
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, Ll/e;

    .line 149
    .line 150
    iget-object v11, v4, Ll/e;->b:Ll/l;

    .line 151
    .line 152
    iget-object v12, v11, Ll/l;->f:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    move v13, v7

    .line 159
    :goto_3
    if-ge v13, v12, :cond_5

    .line 160
    .line 161
    invoke-virtual {v11, v13}, Ll/l;->getItem(I)Landroid/view/MenuItem;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    invoke-interface {v14}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 166
    .line 167
    .line 168
    move-result v15

    .line 169
    if-eqz v15, :cond_4

    .line 170
    .line 171
    invoke-interface {v14}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    if-ne v1, v15, :cond_4

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_4
    add-int/lit8 v13, v13, 0x1

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_5
    move-object v14, v10

    .line 182
    :goto_4
    if-nez v14, :cond_6

    .line 183
    .line 184
    move/from16 v16, v6

    .line 185
    .line 186
    move-object v6, v10

    .line 187
    goto :goto_9

    .line 188
    :cond_6
    iget-object v11, v4, Ll/e;->a:Lm/H0;

    .line 189
    .line 190
    iget-object v11, v11, Lm/C0;->s:Lm/p0;

    .line 191
    .line 192
    invoke-virtual {v11}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    .line 197
    .line 198
    if-eqz v13, :cond_7

    .line 199
    .line 200
    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    .line 201
    .line 202
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    check-cast v12, Ll/i;

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_7
    check-cast v12, Ll/i;

    .line 214
    .line 215
    move v13, v7

    .line 216
    :goto_5
    invoke-virtual {v12}, Ll/i;->getCount()I

    .line 217
    .line 218
    .line 219
    move-result v15

    .line 220
    move/from16 v16, v6

    .line 221
    .line 222
    move v6, v7

    .line 223
    :goto_6
    const/4 v9, -0x1

    .line 224
    if-ge v6, v15, :cond_9

    .line 225
    .line 226
    invoke-virtual {v12, v6}, Ll/i;->b(I)Ll/n;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    if-ne v14, v10, :cond_8

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 234
    .line 235
    const/4 v10, 0x0

    .line 236
    goto :goto_6

    .line 237
    :cond_9
    move v6, v9

    .line 238
    :goto_7
    if-ne v6, v9, :cond_a

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_a
    add-int/2addr v6, v13

    .line 242
    invoke-virtual {v11}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    sub-int/2addr v6, v9

    .line 247
    if-ltz v6, :cond_d

    .line 248
    .line 249
    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    .line 250
    .line 251
    .line 252
    move-result v9

    .line 253
    if-lt v6, v9, :cond_b

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_b
    invoke-virtual {v11, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    goto :goto_9

    .line 261
    :cond_c
    move/from16 v16, v6

    .line 262
    .line 263
    const/4 v4, 0x0

    .line 264
    :cond_d
    :goto_8
    const/4 v6, 0x0

    .line 265
    :goto_9
    if-eqz v6, :cond_19

    .line 266
    .line 267
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 268
    .line 269
    const/16 v10, 0x1c

    .line 270
    .line 271
    iget-object v11, v8, Lm/C0;->P:Lm/y;

    .line 272
    .line 273
    if-gt v9, v10, :cond_e

    .line 274
    .line 275
    sget-object v9, Lm/H0;->T:Ljava/lang/reflect/Method;

    .line 276
    .line 277
    if-eqz v9, :cond_f

    .line 278
    .line 279
    :try_start_0
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 280
    .line 281
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    invoke-virtual {v9, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 286
    .line 287
    .line 288
    goto :goto_a

    .line 289
    :catch_0
    const-string v9, "MenuPopupWindow"

    .line 290
    .line 291
    const-string v10, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    .line 292
    .line 293
    invoke-static {v9, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 294
    .line 295
    .line 296
    goto :goto_a

    .line 297
    :cond_e
    invoke-static {v11, v7}, Lm/F0;->a(Landroid/widget/PopupWindow;Z)V

    .line 298
    .line 299
    .line 300
    :cond_f
    :goto_a
    iget-object v9, v8, Lm/C0;->P:Lm/y;

    .line 301
    .line 302
    const/4 v10, 0x0

    .line 303
    invoke-static {v9, v10}, Lm/E0;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    add-int/lit8 v9, v9, -0x1

    .line 311
    .line 312
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    check-cast v9, Ll/e;

    .line 317
    .line 318
    iget-object v9, v9, Ll/e;->a:Lm/H0;

    .line 319
    .line 320
    iget-object v9, v9, Lm/C0;->s:Lm/p0;

    .line 321
    .line 322
    const/4 v10, 0x2

    .line 323
    new-array v11, v10, [I

    .line 324
    .line 325
    invoke-virtual {v9, v11}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 326
    .line 327
    .line 328
    new-instance v10, Landroid/graphics/Rect;

    .line 329
    .line 330
    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 331
    .line 332
    .line 333
    iget-object v12, v0, Ll/f;->E:Landroid/view/View;

    .line 334
    .line 335
    invoke-virtual {v12, v10}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 336
    .line 337
    .line 338
    iget v12, v0, Ll/f;->F:I

    .line 339
    .line 340
    move/from16 v13, v16

    .line 341
    .line 342
    if-ne v12, v13, :cond_12

    .line 343
    .line 344
    aget v11, v11, v7

    .line 345
    .line 346
    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    .line 347
    .line 348
    .line 349
    move-result v9

    .line 350
    add-int/2addr v9, v11

    .line 351
    add-int/2addr v9, v5

    .line 352
    iget v10, v10, Landroid/graphics/Rect;->right:I

    .line 353
    .line 354
    if-le v9, v10, :cond_11

    .line 355
    .line 356
    :cond_10
    move v9, v7

    .line 357
    :goto_b
    const/4 v13, 0x1

    .line 358
    goto :goto_d

    .line 359
    :cond_11
    :goto_c
    const/4 v9, 0x1

    .line 360
    goto :goto_b

    .line 361
    :cond_12
    aget v9, v11, v7

    .line 362
    .line 363
    sub-int/2addr v9, v5

    .line 364
    if-gez v9, :cond_10

    .line 365
    .line 366
    goto :goto_c

    .line 367
    :goto_d
    if-ne v9, v13, :cond_13

    .line 368
    .line 369
    const/4 v13, 0x1

    .line 370
    goto :goto_e

    .line 371
    :cond_13
    move v13, v7

    .line 372
    :goto_e
    iput v9, v0, Ll/f;->F:I

    .line 373
    .line 374
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 375
    .line 376
    const/16 v10, 0x1a

    .line 377
    .line 378
    const/4 v11, 0x5

    .line 379
    if-lt v9, v10, :cond_14

    .line 380
    .line 381
    iput-object v6, v8, Lm/C0;->E:Landroid/view/View;

    .line 382
    .line 383
    move v10, v7

    .line 384
    move v12, v10

    .line 385
    goto :goto_f

    .line 386
    :cond_14
    const/4 v10, 0x2

    .line 387
    new-array v9, v10, [I

    .line 388
    .line 389
    iget-object v12, v0, Ll/f;->D:Landroid/view/View;

    .line 390
    .line 391
    invoke-virtual {v12, v9}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 392
    .line 393
    .line 394
    new-array v10, v10, [I

    .line 395
    .line 396
    invoke-virtual {v6, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 397
    .line 398
    .line 399
    iget v12, v0, Ll/f;->C:I

    .line 400
    .line 401
    and-int/lit8 v12, v12, 0x7

    .line 402
    .line 403
    if-ne v12, v11, :cond_15

    .line 404
    .line 405
    aget v12, v9, v7

    .line 406
    .line 407
    iget-object v14, v0, Ll/f;->D:Landroid/view/View;

    .line 408
    .line 409
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 410
    .line 411
    .line 412
    move-result v14

    .line 413
    add-int/2addr v14, v12

    .line 414
    aput v14, v9, v7

    .line 415
    .line 416
    aget v12, v10, v7

    .line 417
    .line 418
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 419
    .line 420
    .line 421
    move-result v14

    .line 422
    add-int/2addr v14, v12

    .line 423
    aput v14, v10, v7

    .line 424
    .line 425
    :cond_15
    aget v12, v10, v7

    .line 426
    .line 427
    aget v14, v9, v7

    .line 428
    .line 429
    sub-int/2addr v12, v14

    .line 430
    const/16 v16, 0x1

    .line 431
    .line 432
    aget v10, v10, v16

    .line 433
    .line 434
    aget v9, v9, v16

    .line 435
    .line 436
    sub-int/2addr v10, v9

    .line 437
    :goto_f
    iget v9, v0, Ll/f;->C:I

    .line 438
    .line 439
    and-int/2addr v9, v11

    .line 440
    if-ne v9, v11, :cond_18

    .line 441
    .line 442
    if-eqz v13, :cond_16

    .line 443
    .line 444
    add-int/2addr v12, v5

    .line 445
    goto :goto_10

    .line 446
    :cond_16
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    :cond_17
    sub-int/2addr v12, v5

    .line 451
    goto :goto_10

    .line 452
    :cond_18
    if-eqz v13, :cond_17

    .line 453
    .line 454
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 455
    .line 456
    .line 457
    move-result v5

    .line 458
    add-int/2addr v12, v5

    .line 459
    :goto_10
    iput v12, v8, Lm/C0;->v:I

    .line 460
    .line 461
    const/4 v13, 0x1

    .line 462
    iput-boolean v13, v8, Lm/C0;->A:Z

    .line 463
    .line 464
    iput-boolean v13, v8, Lm/C0;->z:Z

    .line 465
    .line 466
    invoke-virtual {v8, v10}, Lm/C0;->h(I)V

    .line 467
    .line 468
    .line 469
    goto :goto_12

    .line 470
    :cond_19
    iget-boolean v5, v0, Ll/f;->G:Z

    .line 471
    .line 472
    if-eqz v5, :cond_1a

    .line 473
    .line 474
    iget v5, v0, Ll/f;->I:I

    .line 475
    .line 476
    iput v5, v8, Lm/C0;->v:I

    .line 477
    .line 478
    :cond_1a
    iget-boolean v5, v0, Ll/f;->H:Z

    .line 479
    .line 480
    if-eqz v5, :cond_1b

    .line 481
    .line 482
    iget v5, v0, Ll/f;->J:I

    .line 483
    .line 484
    invoke-virtual {v8, v5}, Lm/C0;->h(I)V

    .line 485
    .line 486
    .line 487
    :cond_1b
    iget-object v5, v0, Ll/t;->q:Landroid/graphics/Rect;

    .line 488
    .line 489
    if-eqz v5, :cond_1c

    .line 490
    .line 491
    new-instance v10, Landroid/graphics/Rect;

    .line 492
    .line 493
    invoke-direct {v10, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 494
    .line 495
    .line 496
    goto :goto_11

    .line 497
    :cond_1c
    const/4 v10, 0x0

    .line 498
    :goto_11
    iput-object v10, v8, Lm/C0;->N:Landroid/graphics/Rect;

    .line 499
    .line 500
    :goto_12
    new-instance v5, Ll/e;

    .line 501
    .line 502
    iget v6, v0, Ll/f;->F:I

    .line 503
    .line 504
    invoke-direct {v5, v8, v1, v6}, Ll/e;-><init>(Lm/H0;Ll/l;I)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    invoke-virtual {v8}, Lm/C0;->c()V

    .line 511
    .line 512
    .line 513
    iget-object v2, v8, Lm/C0;->s:Lm/p0;

    .line 514
    .line 515
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 516
    .line 517
    .line 518
    if-nez v4, :cond_1d

    .line 519
    .line 520
    iget-boolean v4, v0, Ll/f;->L:Z

    .line 521
    .line 522
    if-eqz v4, :cond_1d

    .line 523
    .line 524
    iget-object v4, v1, Ll/l;->m:Ljava/lang/CharSequence;

    .line 525
    .line 526
    if-eqz v4, :cond_1d

    .line 527
    .line 528
    const v4, 0x7f0c0012

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3, v4, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    check-cast v3, Landroid/widget/FrameLayout;

    .line 536
    .line 537
    const v4, 0x1020016

    .line 538
    .line 539
    .line 540
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    check-cast v4, Landroid/widget/TextView;

    .line 545
    .line 546
    invoke-virtual {v3, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 547
    .line 548
    .line 549
    iget-object v1, v1, Ll/l;->m:Ljava/lang/CharSequence;

    .line 550
    .line 551
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 552
    .line 553
    .line 554
    const/4 v10, 0x0

    .line 555
    invoke-virtual {v2, v3, v10, v7}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v8}, Lm/C0;->c()V

    .line 559
    .line 560
    .line 561
    :cond_1d
    return-void
.end method
