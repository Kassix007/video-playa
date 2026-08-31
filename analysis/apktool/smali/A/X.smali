.class public final LA/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/E;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA/X;->a:I

    iput-object p2, p0, LA/X;->b:Ljava/lang/Object;

    iput-object p3, p0, LA/X;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, LA/X;->a:I

    .line 2
    .line 3
    iget-object v1, p0, LA/X;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LA/X;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Lu/v0;

    .line 11
    .line 12
    check-cast v1, Lu/p0;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, Lu/p0;->b:LP/f0;

    .line 18
    .line 19
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lu/o0;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Lu/o0;->q:Lu/s0;

    .line 28
    .line 29
    iget-object v1, v2, Lu/v0;->i:La0/q;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La0/q;->remove(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :pswitch_0
    check-cast v2, Lu/v0;

    .line 36
    .line 37
    check-cast v1, Lu/v0;

    .line 38
    .line 39
    iget-object v0, v2, Lu/v0;->j:La0/q;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, La0/q;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_1
    check-cast v2, Lu/H;

    .line 46
    .line 47
    check-cast v1, Lu/E;

    .line 48
    .line 49
    iget-object v0, v2, Lu/H;->a:LR/e;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, LR/e;->l(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_2
    check-cast v2, Landroidx/lifecycle/x;

    .line 56
    .line 57
    invoke-interface {v2}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v1, LW1/f;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_3
    check-cast v2, Landroidx/lifecycle/G;

    .line 68
    .line 69
    check-cast v1, LY/a;

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Landroidx/lifecycle/G;->j(Landroidx/lifecycle/K;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_4
    check-cast v2, LP/S0;

    .line 76
    .line 77
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Ljava/util/List;

    .line 82
    .line 83
    check-cast v0, Ljava/lang/Iterable;

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_1

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, LT1/d;

    .line 100
    .line 101
    move-object v3, v1

    .line 102
    check-cast v3, LU1/i;

    .line 103
    .line 104
    invoke-virtual {v3}, LT1/z;->b()LT1/h;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3, v2}, LT1/h;->c(LT1/d;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    return-void

    .line 113
    :pswitch_5
    check-cast v2, LT1/d;

    .line 114
    .line 115
    iget-object v0, v2, LT1/d;->x:LW1/c;

    .line 116
    .line 117
    iget-object v0, v0, LW1/c;->j:Landroidx/lifecycle/z;

    .line 118
    .line 119
    check-cast v1, LU1/l;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroidx/lifecycle/z;->c(Landroidx/lifecycle/w;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_6
    check-cast v2, LE/W;

    .line 126
    .line 127
    iget-object v0, v2, LE/W;->c:Lr/H;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Lr/H;->j(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_7
    check-cast v2, Landroid/content/Context;

    .line 134
    .line 135
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v1, LC0/b0;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_8
    check-cast v2, Landroid/content/Context;

    .line 146
    .line 147
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v1, LC0/a0;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_9
    check-cast v2, LA/Z;

    .line 158
    .line 159
    check-cast v1, Landroid/view/View;

    .line 160
    .line 161
    iget v0, v2, LA/Z;->t:I

    .line 162
    .line 163
    add-int/lit8 v0, v0, -0x1

    .line 164
    .line 165
    iput v0, v2, LA/Z;->t:I

    .line 166
    .line 167
    if-nez v0, :cond_2

    .line 168
    .line 169
    sget-object v0, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 170
    .line 171
    const/4 v0, 0x0

    .line 172
    invoke-static {v1, v0}, Lw1/B;->l(Landroid/view/View;Lw1/m;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v1, v0}, Lw1/K;->o(Landroid/view/View;Lw1/Q;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, v2, LA/Z;->u:LA/D;

    .line 179
    .line 180
    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 181
    .line 182
    .line 183
    :cond_2
    return-void

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
