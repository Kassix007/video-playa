.class public final LC0/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v;


# instance fields
.field public final synthetic q:LR5/d;

.field public final synthetic r:LC0/h0;

.field public final synthetic s:LP/v0;

.field public final synthetic t:Lkotlin/jvm/internal/y;

.field public final synthetic u:Landroid/view/View;


# direct methods
.method public constructor <init>(LR5/d;LC0/h0;LP/v0;Lkotlin/jvm/internal/y;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC0/p1;->q:LR5/d;

    .line 5
    .line 6
    iput-object p2, p0, LC0/p1;->r:LC0/h0;

    .line 7
    .line 8
    iput-object p3, p0, LC0/p1;->s:LP/v0;

    .line 9
    .line 10
    iput-object p4, p0, LC0/p1;->t:Lkotlin/jvm/internal/y;

    .line 11
    .line 12
    iput-object p5, p0, LC0/p1;->u:Landroid/view/View;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final e(Landroidx/lifecycle/x;Landroidx/lifecycle/o;)V
    .locals 10

    .line 1
    sget-object v0, LC0/l1;->a:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p2, v0, p2

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eq p2, v1, :cond_8

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    if-eq p2, p1, :cond_2

    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    if-eq p2, p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x4

    .line 20
    if-eq p2, p1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LC0/p1;->s:LP/v0;

    .line 25
    .line 26
    invoke-virtual {p1}, LP/v0;->t()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object p1, p0, LC0/p1;->s:LP/v0;

    .line 31
    .line 32
    iget-object p2, p1, LP/v0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter p2

    .line 35
    :try_start_0
    iput-boolean v1, p1, LP/v0;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    monitor-exit p2

    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    move-object p1, v0

    .line 41
    monitor-exit p2

    .line 42
    throw p1

    .line 43
    :cond_2
    iget-object p1, p0, LC0/p1;->r:LC0/h0;

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    iget-object p1, p1, LC0/h0;->s:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, LK2/a;

    .line 51
    .line 52
    iget-object v2, p1, LK2/a;->c:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v2

    .line 55
    :try_start_1
    iget-object v3, p1, LK2/a;->c:Ljava/lang/Object;

    .line 56
    .line 57
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    :try_start_2
    iget-boolean v4, p1, LK2/a;->b:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 59
    .line 60
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    monitor-exit v2

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    :try_start_4
    iget-object v3, p1, LK2/a;->d:Ljava/io/Serializable;

    .line 66
    .line 67
    check-cast v3, Ljava/util/ArrayList;

    .line 68
    .line 69
    iget-object v4, p1, LK2/a;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, Ljava/util/ArrayList;

    .line 72
    .line 73
    iput-object v4, p1, LK2/a;->d:Ljava/io/Serializable;

    .line 74
    .line 75
    iput-object v3, p1, LK2/a;->e:Ljava/lang/Object;

    .line 76
    .line 77
    iput-boolean v1, p1, LK2/a;->b:Z

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    move v1, p2

    .line 84
    :goto_0
    if-ge v1, p1, :cond_4

    .line 85
    .line 86
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Lq5/c;

    .line 91
    .line 92
    sget-object v5, Lm5/y;->a:Lm5/y;

    .line 93
    .line 94
    invoke-interface {v4, v5}, Lq5/c;->resumeWith(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    move-object p1, v0

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 104
    .line 105
    .line 106
    monitor-exit v2

    .line 107
    goto :goto_2

    .line 108
    :catchall_2
    move-exception v0

    .line 109
    move-object p1, v0

    .line 110
    :try_start_5
    monitor-exit v3

    .line 111
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 112
    :goto_1
    monitor-exit v2

    .line 113
    throw p1

    .line 114
    :cond_5
    :goto_2
    iget-object p1, p0, LC0/p1;->s:LP/v0;

    .line 115
    .line 116
    iget-object v1, p1, LP/v0;->b:Ljava/lang/Object;

    .line 117
    .line 118
    monitor-enter v1

    .line 119
    :try_start_6
    iget-boolean v2, p1, LP/v0;->s:Z

    .line 120
    .line 121
    if-eqz v2, :cond_6

    .line 122
    .line 123
    iput-boolean p2, p1, LP/v0;->s:Z

    .line 124
    .line 125
    invoke-virtual {p1}, LP/v0;->u()LM5/f;

    .line 126
    .line 127
    .line 128
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 129
    goto :goto_3

    .line 130
    :catchall_3
    move-exception v0

    .line 131
    move-object p1, v0

    .line 132
    goto :goto_5

    .line 133
    :cond_6
    :goto_3
    monitor-exit v1

    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 137
    .line 138
    check-cast v0, LM5/h;

    .line 139
    .line 140
    invoke-virtual {v0, p1}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    :goto_4
    return-void

    .line 144
    :goto_5
    monitor-exit v1

    .line 145
    throw p1

    .line 146
    :cond_8
    iget-object p2, p0, LC0/p1;->q:LR5/d;

    .line 147
    .line 148
    sget-object v2, LM5/x;->t:LM5/x;

    .line 149
    .line 150
    new-instance v3, LC0/o1;

    .line 151
    .line 152
    iget-object v4, p0, LC0/p1;->t:Lkotlin/jvm/internal/y;

    .line 153
    .line 154
    iget-object v5, p0, LC0/p1;->s:LP/v0;

    .line 155
    .line 156
    iget-object v8, p0, LC0/p1;->u:Landroid/view/View;

    .line 157
    .line 158
    const/4 v9, 0x0

    .line 159
    move-object v7, p0

    .line 160
    move-object v6, p1

    .line 161
    invoke-direct/range {v3 .. v9}, LC0/o1;-><init>(Lkotlin/jvm/internal/y;LP/v0;Landroidx/lifecycle/x;LC0/p1;Landroid/view/View;Lq5/c;)V

    .line 162
    .line 163
    .line 164
    invoke-static {p2, v0, v2, v3, v1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 165
    .line 166
    .line 167
    return-void
.end method
