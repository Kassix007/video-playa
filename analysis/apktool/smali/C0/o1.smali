.class public final LC0/o1;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lkotlin/jvm/internal/y;

.field public final synthetic t:LP/v0;

.field public final synthetic u:Landroidx/lifecycle/x;

.field public final synthetic v:LC0/p1;

.field public final synthetic w:Landroid/view/View;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/y;LP/v0;Landroidx/lifecycle/x;LC0/p1;Landroid/view/View;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC0/o1;->s:Lkotlin/jvm/internal/y;

    .line 2
    .line 3
    iput-object p2, p0, LC0/o1;->t:LP/v0;

    .line 4
    .line 5
    iput-object p3, p0, LC0/o1;->u:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iput-object p4, p0, LC0/o1;->v:LC0/p1;

    .line 8
    .line 9
    iput-object p5, p0, LC0/o1;->w:Landroid/view/View;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ls5/i;-><init>(ILq5/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 7

    .line 1
    new-instance v0, LC0/o1;

    .line 2
    .line 3
    iget-object v4, p0, LC0/o1;->v:LC0/p1;

    .line 4
    .line 5
    iget-object v5, p0, LC0/o1;->w:Landroid/view/View;

    .line 6
    .line 7
    iget-object v1, p0, LC0/o1;->s:Lkotlin/jvm/internal/y;

    .line 8
    .line 9
    iget-object v2, p0, LC0/o1;->t:LP/v0;

    .line 10
    .line 11
    iget-object v3, p0, LC0/o1;->u:Landroidx/lifecycle/x;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, LC0/o1;-><init>(Lkotlin/jvm/internal/y;LP/v0;Landroidx/lifecycle/x;LC0/p1;Landroid/view/View;Lq5/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, LC0/o1;->r:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LC0/o1;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LC0/o1;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LC0/o1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LC0/o1;->q:I

    .line 2
    .line 3
    iget-object v1, p0, LC0/o1;->v:LC0/p1;

    .line 4
    .line 5
    iget-object v2, p0, LC0/o1;->u:Landroidx/lifecycle/x;

    .line 6
    .line 7
    sget-object v3, Lm5/y;->a:Lm5/y;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-ne v0, v4, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LC0/o1;->r:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, LM5/b0;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, LC0/o1;->r:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, LM5/w;

    .line 41
    .line 42
    :try_start_1
    iget-object v0, p0, LC0/o1;->s:Lkotlin/jvm/internal/y;

    .line 43
    .line 44
    iget-object v0, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, LC0/K0;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v6, p0, LC0/o1;->w:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-static {v6}, LC0/s1;->a(Landroid/content/Context;)LP5/P;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-interface {v6}, LP5/P;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    iget-object v8, v0, LC0/K0;->q:LP/b0;

    .line 75
    .line 76
    invoke-virtual {v8, v7}, LP/b0;->f(F)V

    .line 77
    .line 78
    .line 79
    new-instance v7, LC0/n1;

    .line 80
    .line 81
    invoke-direct {v7, v6, v0, v5}, LC0/n1;-><init>(LP5/P;LC0/K0;Lq5/c;)V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x3

    .line 85
    invoke-static {p1, v5, v5, v7, v0}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 86
    .line 87
    .line 88
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    move-object v0, p1

    .line 90
    goto :goto_0

    .line 91
    :catchall_1
    move-exception p1

    .line 92
    move-object v0, v5

    .line 93
    goto :goto_4

    .line 94
    :cond_2
    move-object v0, v5

    .line 95
    :goto_0
    :try_start_2
    iget-object p1, p0, LC0/o1;->t:LP/v0;

    .line 96
    .line 97
    iput-object v0, p0, LC0/o1;->r:Ljava/lang/Object;

    .line 98
    .line 99
    iput v4, p0, LC0/o1;->q:I

    .line 100
    .line 101
    new-instance v4, LP/u0;

    .line 102
    .line 103
    invoke-direct {v4, p1, v5}, LP/u0;-><init>(LP/v0;Lq5/c;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p0}, Lq5/c;->getContext()Lq5/h;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-static {v6}, LP/b;->o(Lq5/h;)LP/T;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    iget-object v7, p1, LP/v0;->a:LP/e;

    .line 115
    .line 116
    new-instance v8, LP/s0;

    .line 117
    .line 118
    invoke-direct {v8, p1, v4, v6, v5}, LP/s0;-><init>(LP/v0;LP/u0;LP/T;Lq5/c;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v7, v8, p0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 126
    .line 127
    if-ne p1, v4, :cond_3

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    move-object p1, v3

    .line 131
    :goto_1
    if-ne p1, v4, :cond_4

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    move-object p1, v3

    .line 135
    :goto_2
    if-ne p1, v4, :cond_5

    .line 136
    .line 137
    return-object v4

    .line 138
    :cond_5
    :goto_3
    if-eqz v0, :cond_6

    .line 139
    .line 140
    invoke-interface {v0, v5}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    invoke-interface {v2}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p1, v1}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 148
    .line 149
    .line 150
    return-object v3

    .line 151
    :goto_4
    if-eqz v0, :cond_7

    .line 152
    .line 153
    invoke-interface {v0, v5}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 154
    .line 155
    .line 156
    :cond_7
    invoke-interface {v2}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0, v1}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 161
    .line 162
    .line 163
    throw p1
.end method
