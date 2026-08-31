.class public final LF/h;
.super Ls5/h;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public r:Lv0/l;

.field public s:Lv0/l;

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:LF/e;


# direct methods
.method public constructor <init>(LF/e;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/h;->v:LF/e;

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
    new-instance v0, LF/h;

    .line 2
    .line 3
    iget-object v1, p0, LF/h;->v:LF/e;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LF/h;-><init>(LF/e;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LF/h;->u:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LF/h;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LF/h;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LF/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, LF/h;->v:LF/e;

    .line 2
    .line 3
    iget-object v0, v0, LF/N;->c:LP/f0;

    .line 4
    .line 5
    iget v1, p0, LF/h;->t:I

    .line 6
    .line 7
    sget-object v2, Lv0/g;->q:Lv0/g;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    if-eq v1, v5, :cond_1

    .line 17
    .line 18
    if-ne v1, v3, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, LF/h;->s:Lv0/l;

    .line 21
    .line 22
    iget-object v5, p0, LF/h;->r:Lv0/l;

    .line 23
    .line 24
    iget-object v7, p0, LF/h;->u:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v7, Lv0/y;

    .line 27
    .line 28
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    iget-object v1, p0, LF/h;->u:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lv0/y;

    .line 43
    .line 44
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, LF/h;->u:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v1, p1

    .line 54
    check-cast v1, Lv0/y;

    .line 55
    .line 56
    iput-object v1, p0, LF/h;->u:Ljava/lang/Object;

    .line 57
    .line 58
    iput v5, p0, LF/h;->t:I

    .line 59
    .line 60
    invoke-static {v1, v4, v2, p0}, Lw/g1;->b(Lv0/y;ZLv0/g;Ls5/a;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v6, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    :goto_0
    check-cast p1, Lv0/l;

    .line 68
    .line 69
    new-instance v5, Li0/b;

    .line 70
    .line 71
    const-wide/16 v7, 0x0

    .line 72
    .line 73
    invoke-direct {v5, v7, v8}, Li0/b;-><init>(J)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v5}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const/4 v5, 0x0

    .line 80
    move-object v7, v1

    .line 81
    move-object v1, v5

    .line 82
    move-object v5, p1

    .line 83
    :goto_1
    if-nez v1, :cond_7

    .line 84
    .line 85
    iput-object v7, p0, LF/h;->u:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object v5, p0, LF/h;->r:Lv0/l;

    .line 88
    .line 89
    iput-object v1, p0, LF/h;->s:Lv0/l;

    .line 90
    .line 91
    iput v3, p0, LF/h;->t:I

    .line 92
    .line 93
    invoke-virtual {v7, v2, p0}, Lv0/y;->a(Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v6, :cond_4

    .line 98
    .line 99
    :goto_2
    return-object v6

    .line 100
    :cond_4
    :goto_3
    check-cast p1, Lv0/f;

    .line 101
    .line 102
    iget-object v8, p1, Lv0/f;->a:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v9, v8

    .line 105
    check-cast v9, Ljava/util/Collection;

    .line 106
    .line 107
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    move v10, v4

    .line 112
    :goto_4
    if-ge v10, v9, :cond_6

    .line 113
    .line 114
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    check-cast v11, Lv0/l;

    .line 119
    .line 120
    invoke-static {v11}, Lv0/v;->b(Lv0/l;)Z

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    if-nez v11, :cond_5

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_6
    iget-object p1, p1, Lv0/f;->a:Ljava/lang/Object;

    .line 131
    .line 132
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    move-object v1, p1

    .line 137
    check-cast v1, Lv0/l;

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_7
    iget-wide v1, v1, Lv0/l;->c:J

    .line 141
    .line 142
    iget-wide v3, v5, Lv0/l;->c:J

    .line 143
    .line 144
    invoke-static {v1, v2, v3, v4}, Li0/b;->d(JJ)J

    .line 145
    .line 146
    .line 147
    move-result-wide v1

    .line 148
    new-instance p1, Li0/b;

    .line 149
    .line 150
    invoke-direct {p1, v1, v2}, Li0/b;-><init>(J)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 157
    .line 158
    return-object p1
.end method
