.class public final LC0/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC0/D;->q:I

    iput-object p2, p0, LC0/D;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, LC0/D;->q:I

    .line 2
    .line 3
    iget-object v0, p0, LC0/D;->r:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, Lv4/m;

    .line 9
    .line 10
    iget-object p1, v0, Lv4/m;->J:Landroid/view/accessibility/AccessibilityManager;

    .line 11
    .line 12
    iget-object v1, v0, Lv4/m;->K:LR4/L0;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object v1, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Lv4/m;->K:LR4/L0;

    .line 27
    .line 28
    new-instance v1, Lx1/b;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lx1/b;-><init>(LR4/L0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 34
    .line 35
    .line 36
    :cond_0
    :pswitch_0
    return-void

    .line 37
    :pswitch_1
    check-cast v0, Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 43
    .line 44
    invoke-static {v0}, Lw1/z;->c(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    :pswitch_2
    return-void

    .line 48
    :pswitch_3
    check-cast v0, LC0/I;

    .line 49
    .line 50
    iget-object p1, v0, LC0/I;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 51
    .line 52
    iget-object v1, v0, LC0/I;->i:LC0/B;

    .line 53
    .line 54
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, LC0/I;->j:LC0/C;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 5

    .line 1
    iget v0, p0, LC0/D;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LC0/D;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lv4/m;

    .line 9
    .line 10
    iget-object v0, p1, Lv4/m;->K:LR4/L0;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Lv4/m;->J:Landroid/view/accessibility/AccessibilityManager;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    new-instance v1, Lx1/b;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lx1/b;-><init>(LR4/L0;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :pswitch_0
    iget-object v0, p0, LC0/D;->r:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ll/C;

    .line 30
    .line 31
    iget-object v1, v0, Ll/C;->E:Landroid/view/ViewTreeObserver;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, v0, Ll/C;->E:Landroid/view/ViewTreeObserver;

    .line 46
    .line 47
    :cond_1
    iget-object v1, v0, Ll/C;->E:Landroid/view/ViewTreeObserver;

    .line 48
    .line 49
    iget-object v0, v0, Ll/C;->y:Ll/d;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_1
    iget-object v0, p0, LC0/D;->r:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ll/f;

    .line 61
    .line 62
    iget-object v1, v0, Ll/f;->N:Landroid/view/ViewTreeObserver;

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, v0, Ll/f;->N:Landroid/view/ViewTreeObserver;

    .line 77
    .line 78
    :cond_3
    iget-object v1, v0, Ll/f;->N:Landroid/view/ViewTreeObserver;

    .line 79
    .line 80
    iget-object v0, v0, Ll/f;->y:Ll/d;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 86
    .line 87
    .line 88
    :pswitch_2
    return-void

    .line 89
    :pswitch_3
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, LC0/D;->r:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, LM5/B;

    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-virtual {p1, v0}, LM5/i0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_4
    iget-object p1, p0, LC0/D;->r:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, LC0/a;

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v1, Lw1/N;->q:Lw1/N;

    .line 110
    .line 111
    invoke-static {v0, v1}, LI5/k;->R(Ljava/lang/Object;LB5/c;)LI5/i;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v0}, LI5/i;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    const/4 v2, 0x0

    .line 124
    const/4 v3, 0x0

    .line 125
    if-eqz v1, :cond_8

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Landroid/view/ViewParent;

    .line 132
    .line 133
    instance-of v4, v1, Landroid/view/View;

    .line 134
    .line 135
    if-eqz v4, :cond_5

    .line 136
    .line 137
    check-cast v1, Landroid/view/View;

    .line 138
    .line 139
    const-string v4, "<this>"

    .line 140
    .line 141
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const v4, 0x7f0900fe

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    instance-of v4, v1, Ljava/lang/Boolean;

    .line 152
    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    check-cast v1, Ljava/lang/Boolean;

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_6
    move-object v1, v2

    .line 159
    :goto_0
    if-eqz v1, :cond_7

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    :cond_7
    if-eqz v3, :cond_5

    .line 166
    .line 167
    const/4 v3, 0x1

    .line 168
    :cond_8
    if-nez v3, :cond_a

    .line 169
    .line 170
    iget-object v0, p1, LC0/a;->s:LC0/w1;

    .line 171
    .line 172
    if-eqz v0, :cond_9

    .line 173
    .line 174
    invoke-virtual {v0}, LC0/w1;->d()V

    .line 175
    .line 176
    .line 177
    :cond_9
    iput-object v2, p1, LC0/a;->s:LC0/w1;

    .line 178
    .line 179
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 180
    .line 181
    .line 182
    :cond_a
    return-void

    .line 183
    :pswitch_5
    iget-object p1, p0, LC0/D;->r:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p1, LC0/I;

    .line 186
    .line 187
    iget-object v0, p1, LC0/I;->l:Landroid/os/Handler;

    .line 188
    .line 189
    iget-object v1, p1, LC0/I;->M:LC0/m;

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 192
    .line 193
    .line 194
    iget-object v0, p1, LC0/I;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 195
    .line 196
    iget-object v1, p1, LC0/I;->i:LC0/B;

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 199
    .line 200
    .line 201
    iget-object p1, p1, LC0/I;->j:LC0/C;

    .line 202
    .line 203
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
