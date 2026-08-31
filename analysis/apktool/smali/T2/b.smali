.class public final LT2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld6/q;


# direct methods
.method public synthetic constructor <init>(Ld6/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT2/b;->a:Ld6/q;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Ld6/q;LQ2/t;LQ2/k;Ls5/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, LT2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LT2/a;

    .line 7
    .line 8
    iget v1, v0, LT2/a;->t:I

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
    iput v1, v0, LT2/a;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LT2/a;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LT2/a;->s:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LT2/a;->t:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v4, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, LT2/a;->q:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljava/io/Closeable;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_2
    iget-object p0, v0, LT2/a;->q:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, LB5/e;

    .line 66
    .line 67
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    iget-object p0, v0, LT2/a;->r:Ld6/q;

    .line 72
    .line 73
    iget-object p1, v0, LT2/a;->q:Ljava/lang/Object;

    .line 74
    .line 75
    move-object p2, p1

    .line 76
    check-cast p2, LB5/e;

    .line 77
    .line 78
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iput-object p2, v0, LT2/a;->q:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object p0, v0, LT2/a;->r:Ld6/q;

    .line 88
    .line 89
    iput v4, v0, LT2/a;->t:I

    .line 90
    .line 91
    invoke-static {p1, v0}, LD5/a;->l(LQ2/t;Ls5/c;)Ld6/s;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    if-ne p3, v6, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    :goto_1
    check-cast p3, Ld6/s;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const-string p1, "request"

    .line 104
    .line 105
    invoke-static {p3, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, Lh6/h;

    .line 109
    .line 110
    invoke-direct {p1, p0, p3}, Lh6/h;-><init>(Ld6/q;Ld6/s;)V

    .line 111
    .line 112
    .line 113
    iput-object p2, v0, LT2/a;->q:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v5, v0, LT2/a;->r:Ld6/q;

    .line 116
    .line 117
    iput v3, v0, LT2/a;->t:I

    .line 118
    .line 119
    new-instance p0, LM5/h;

    .line 120
    .line 121
    invoke-static {v0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    invoke-direct {p0, v4, p3}, LM5/h;-><init>(ILq5/c;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, LM5/h;->s()V

    .line 129
    .line 130
    .line 131
    new-instance p3, LH2/g;

    .line 132
    .line 133
    const/4 v1, 0x1

    .line 134
    invoke-direct {p3, p1, p0, v1}, LH2/g;-><init>(Lh6/h;LM5/h;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, p3}, Lh6/h;->e(LH2/g;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p3}, LM5/h;->u(LB5/c;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, LM5/h;->r()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    if-ne p3, v6, :cond_6

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    move-object p0, p2

    .line 151
    :goto_2
    move-object p1, p3

    .line 152
    check-cast p1, Ljava/io/Closeable;

    .line 153
    .line 154
    :try_start_1
    move-object p2, p1

    .line 155
    check-cast p2, Ld6/u;

    .line 156
    .line 157
    invoke-static {p2}, LD5/a;->k(Ld6/u;)LQ2/u;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    iput-object p1, v0, LT2/a;->q:Ljava/lang/Object;

    .line 162
    .line 163
    iput v2, v0, LT2/a;->t:I

    .line 164
    .line 165
    invoke-interface {p0, p2, v0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 169
    if-ne p3, v6, :cond_7

    .line 170
    .line 171
    :goto_3
    return-object v6

    .line 172
    :cond_7
    move-object p0, p1

    .line 173
    :goto_4
    invoke-static {p0, v5}, Lcom/google/android/gms/internal/measurement/I1;->N(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    return-object p3

    .line 177
    :catchall_1
    move-exception p0

    .line 178
    move-object v7, p1

    .line 179
    move-object p1, p0

    .line 180
    move-object p0, v7

    .line 181
    :goto_5
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 182
    :catchall_2
    move-exception p2

    .line 183
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/I1;->N(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    throw p2
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LT2/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, LT2/b;

    .line 7
    .line 8
    iget-object p1, p1, LT2/b;->a:Ld6/q;

    .line 9
    .line 10
    iget-object v0, p0, LT2/b;->a:Ld6/q;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x1

    .line 21
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LT2/b;->a:Ld6/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CallFactoryNetworkClient(callFactory="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LT2/b;->a:Ld6/q;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
