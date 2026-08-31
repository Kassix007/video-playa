.class public final LP5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/h;


# instance fields
.field public final synthetic q:LP5/d;

.field public final synthetic r:Lc/f;


# direct methods
.method public constructor <init>(LP5/d;Lc/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP5/n;->q:LP5/d;

    .line 5
    .line 6
    iput-object p2, p0, LP5/n;->r:Lc/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final collect(LP5/i;Lq5/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, LP5/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LP5/m;

    .line 7
    .line 8
    iget v1, v0, LP5/m;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP5/m;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP5/m;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LP5/m;-><init>(LP5/n;Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LP5/m;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LP5/m;->r:I

    .line 28
    .line 29
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    sget-object v7, Lr5/a;->q:Lr5/a;

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    if-eq v1, v5, :cond_3

    .line 40
    .line 41
    if-eq v1, v4, :cond_2

    .line 42
    .line 43
    if-ne v1, v3, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, LP5/m;->t:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, LQ5/y;

    .line 48
    .line 49
    :try_start_0
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :catchall_0
    move-exception p2

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    iget-object p1, v0, LP5/m;->t:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Ljava/lang/Throwable;

    .line 66
    .line 67
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_6

    .line 71
    :cond_3
    iget-object p1, v0, LP5/m;->u:LP5/i;

    .line 72
    .line 73
    iget-object v1, v0, LP5/m;->t:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, LP5/n;

    .line 76
    .line 77
    :try_start_1
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_1
    move-exception p1

    .line 82
    goto :goto_4

    .line 83
    :cond_4
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :try_start_2
    iget-object p2, p0, LP5/n;->q:LP5/d;

    .line 87
    .line 88
    iput-object p0, v0, LP5/m;->t:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object p1, v0, LP5/m;->u:LP5/i;

    .line 91
    .line 92
    iput v5, v0, LP5/m;->r:I

    .line 93
    .line 94
    invoke-virtual {p2, p1, v0}, LP5/d;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 98
    if-ne p2, v7, :cond_5

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_5
    move-object v1, p0

    .line 102
    :goto_1
    new-instance p2, LQ5/y;

    .line 103
    .line 104
    invoke-interface {v0}, Lq5/c;->getContext()Lq5/h;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-direct {p2, p1, v4}, LQ5/y;-><init>(LP5/i;Lq5/h;)V

    .line 109
    .line 110
    .line 111
    :try_start_3
    iget-object p1, v1, LP5/n;->r:Lc/f;

    .line 112
    .line 113
    iput-object p2, v0, LP5/m;->t:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v6, v0, LP5/m;->u:LP5/i;

    .line 116
    .line 117
    iput v3, v0, LP5/m;->r:I

    .line 118
    .line 119
    invoke-virtual {p1, p2, v6, v0}, Lc/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 120
    .line 121
    .line 122
    if-ne v2, v7, :cond_6

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_6
    move-object p1, p2

    .line 126
    :goto_2
    invoke-virtual {p1}, Ls5/c;->releaseIntercepted()V

    .line 127
    .line 128
    .line 129
    return-object v2

    .line 130
    :catchall_2
    move-exception p1

    .line 131
    move-object v8, p2

    .line 132
    move-object p2, p1

    .line 133
    move-object p1, v8

    .line 134
    :goto_3
    invoke-virtual {p1}, Ls5/c;->releaseIntercepted()V

    .line 135
    .line 136
    .line 137
    throw p2

    .line 138
    :catchall_3
    move-exception p1

    .line 139
    move-object v1, p0

    .line 140
    :goto_4
    new-instance p2, LP5/U;

    .line 141
    .line 142
    invoke-direct {p2, p1}, LP5/U;-><init>(Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    iget-object v1, v1, LP5/n;->r:Lc/f;

    .line 146
    .line 147
    iput-object p1, v0, LP5/m;->t:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v6, v0, LP5/m;->u:LP5/i;

    .line 150
    .line 151
    iput v4, v0, LP5/m;->r:I

    .line 152
    .line 153
    invoke-static {p2, v1, p1, v0}, LP5/H;->c(LP5/U;Lc/f;Ljava/lang/Throwable;Ls5/c;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    if-ne p2, v7, :cond_7

    .line 158
    .line 159
    :goto_5
    return-object v7

    .line 160
    :cond_7
    :goto_6
    throw p1
.end method
