.class public final Lv/k;
.super Ls5/h;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lv/l;


# direct methods
.method public constructor <init>(Lv/l;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/k;->t:Lv/l;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/h;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance v0, Lv/k;

    .line 2
    .line 3
    iget-object v1, p0, Lv/k;->t:Lv/l;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lv/k;-><init>(Lv/l;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lv/k;->s:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv0/y;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lv/k;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lv/k;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lv/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lv/k;->r:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object v2, p0, Lv/k;->t:Lv/l;

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-eq v0, v3, :cond_1

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lv/k;->s:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lv0/y;

    .line 18
    .line 19
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v0, p0, Lv/k;->s:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lv0/y;

    .line 34
    .line 35
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lv/k;->s:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v0, p1

    .line 45
    check-cast v0, Lv0/y;

    .line 46
    .line 47
    iput-object v0, p0, Lv/k;->s:Ljava/lang/Object;

    .line 48
    .line 49
    iput v3, p0, Lv/k;->r:I

    .line 50
    .line 51
    invoke-static {v0, p0, v1}, Lw/g1;->c(Lv0/y;Ls5/h;I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v4, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    :goto_0
    check-cast p1, Lv0/l;

    .line 59
    .line 60
    iget-wide v5, p1, Lv0/l;->a:J

    .line 61
    .line 62
    iput-wide v5, v2, Lv/l;->h:J

    .line 63
    .line 64
    iget-wide v5, p1, Lv0/l;->c:J

    .line 65
    .line 66
    iput-wide v5, v2, Lv/l;->b:J

    .line 67
    .line 68
    :cond_4
    iput-object v0, p0, Lv/k;->s:Ljava/lang/Object;

    .line 69
    .line 70
    iput v1, p0, Lv/k;->r:I

    .line 71
    .line 72
    sget-object p1, Lv0/g;->r:Lv0/g;

    .line 73
    .line 74
    invoke-virtual {v0, p1, p0}, Lv0/y;->a(Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v4, :cond_5

    .line 79
    .line 80
    :goto_1
    return-object v4

    .line 81
    :cond_5
    :goto_2
    check-cast p1, Lv0/f;

    .line 82
    .line 83
    iget-object p1, p1, Lv0/f;->a:Ljava/lang/Object;

    .line 84
    .line 85
    new-instance v3, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    move-object v5, p1

    .line 95
    check-cast v5, Ljava/util/Collection;

    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    const/4 v6, 0x0

    .line 102
    move v7, v6

    .line 103
    :goto_3
    if-ge v7, v5, :cond_7

    .line 104
    .line 105
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    move-object v9, v8

    .line 110
    check-cast v9, Lv0/l;

    .line 111
    .line 112
    iget-boolean v9, v9, Lv0/l;->d:Z

    .line 113
    .line 114
    if-eqz v9, :cond_6

    .line 115
    .line 116
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    :goto_4
    if-ge v6, p1, :cond_9

    .line 127
    .line 128
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    move-object v7, v5

    .line 133
    check-cast v7, Lv0/l;

    .line 134
    .line 135
    iget-wide v7, v7, Lv0/l;->a:J

    .line 136
    .line 137
    iget-wide v9, v2, Lv/l;->h:J

    .line 138
    .line 139
    invoke-static {v7, v8, v9, v10}, Lv0/v;->d(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-eqz v7, :cond_8

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_9
    const/4 v5, 0x0

    .line 150
    :goto_5
    check-cast v5, Lv0/l;

    .line 151
    .line 152
    if-nez v5, :cond_a

    .line 153
    .line 154
    invoke-static {v3}, Ln5/l;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    move-object v5, p1

    .line 159
    check-cast v5, Lv0/l;

    .line 160
    .line 161
    :cond_a
    if-eqz v5, :cond_b

    .line 162
    .line 163
    iget-wide v6, v5, Lv0/l;->a:J

    .line 164
    .line 165
    iput-wide v6, v2, Lv/l;->h:J

    .line 166
    .line 167
    iget-wide v5, v5, Lv0/l;->c:J

    .line 168
    .line 169
    iput-wide v5, v2, Lv/l;->b:J

    .line 170
    .line 171
    :cond_b
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-eqz p1, :cond_4

    .line 176
    .line 177
    const-wide/16 v0, -0x1

    .line 178
    .line 179
    iput-wide v0, v2, Lv/l;->h:J

    .line 180
    .line 181
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 182
    .line 183
    return-object p1
.end method
