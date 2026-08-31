.class public abstract LC0/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LC0/x1;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(LC0/a;LP/r;LX/e;)LC0/w1;
    .locals 6

    .line 1
    sget-object v0, LC0/B0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x6

    .line 13
    invoke-static {v2, v3, v0}, Ll6/d;->e(ILO5/a;I)LO5/e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v2, LC0/f0;->A:Lm5/o;

    .line 18
    .line 19
    invoke-virtual {v2}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lq5/h;

    .line 24
    .line 25
    invoke-static {v2}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v4, LC0/A0;

    .line 30
    .line 31
    invoke-direct {v4, v0, v3}, LC0/A0;-><init>(LO5/e;Lq5/c;)V

    .line 32
    .line 33
    .line 34
    const/4 v5, 0x3

    .line 35
    invoke-static {v2, v3, v3, v4, v5}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 36
    .line 37
    .line 38
    new-instance v2, LB0/a;

    .line 39
    .line 40
    const/4 v4, 0x6

    .line 41
    invoke-direct {v2, v4, v0}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object v0, La0/n;->b:Ljava/lang/Object;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_0
    sget-object v4, La0/n;->h:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, Ljava/util/Collection;

    .line 50
    .line 51
    invoke-static {v4, v2}, Ln5/l;->v0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sput-object v2, La0/n;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    monitor-exit v0

    .line 58
    invoke-static {}, La0/n;->a()V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    monitor-exit v0

    .line 64
    throw p0

    .line 65
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-lez v0, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    instance-of v1, v0, LC0/A;

    .line 76
    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    check-cast v0, LC0/A;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_1
    :goto_1
    move-object v0, v3

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :goto_2
    if-nez v0, :cond_3

    .line 89
    .line 90
    new-instance v0, LC0/A;

    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1}, LP/r;->h()Lq5/h;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-direct {v0, v1, v2}, LC0/A;-><init>(Landroid/content/Context;Lq5/h;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, LC0/A;->getView()Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sget-object v2, LC0/x1;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 108
    .line 109
    invoke-virtual {p0, v1, v2}, LC0/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    invoke-virtual {v0}, LC0/A;->getView()Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    const v1, 0x7f09021d

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    instance-of v2, p0, LC0/w1;

    .line 124
    .line 125
    if-eqz v2, :cond_4

    .line 126
    .line 127
    move-object v3, p0

    .line 128
    check-cast v3, LC0/w1;

    .line 129
    .line 130
    :cond_4
    if-nez v3, :cond_5

    .line 131
    .line 132
    new-instance v3, LC0/w1;

    .line 133
    .line 134
    new-instance p0, LB0/G0;

    .line 135
    .line 136
    invoke-virtual {v0}, LC0/A;->getRoot()LB0/L;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-direct {p0, v2}, LB0/G0;-><init>(LB0/L;)V

    .line 141
    .line 142
    .line 143
    new-instance v2, LP/u;

    .line 144
    .line 145
    invoke-direct {v2, p1, p0}, LP/u;-><init>(LP/r;LB0/G0;)V

    .line 146
    .line 147
    .line 148
    invoke-direct {v3, v0, v2}, LC0/w1;-><init>(LC0/A;LP/u;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, LC0/A;->getView()Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0, v1, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_5
    invoke-virtual {v3, p2}, LC0/w1;->g(LB5/e;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, LC0/A;->getCoroutineContext()Lq5/h;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {p1}, LP/r;->h()Lq5/h;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-static {p0, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-nez p0, :cond_6

    .line 174
    .line 175
    invoke-virtual {p1}, LP/r;->h()Lq5/h;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {v0, p0}, LC0/A;->setCoroutineContext(Lq5/h;)V

    .line 180
    .line 181
    .line 182
    :cond_6
    return-object v3
.end method
