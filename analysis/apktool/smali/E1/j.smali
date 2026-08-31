.class public final LE1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final r:I

.field public final s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LE1/j;->q:I

    iput-object p3, p0, LE1/j;->s:Ljava/lang/Object;

    iput p1, p0, LE1/j;->r:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    const/4 p3, 0x0

    iput p3, p0, LE1/j;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string p3, "initCallbacks cannot be null"

    invoke-static {p1, p3}, LE3/h;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p3, p0, LE1/j;->s:Ljava/lang/Object;

    .line 5
    iput p2, p0, LE1/j;->r:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, LE1/j;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE1/j;->s:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv3/o;

    .line 9
    .line 10
    iget v1, p0, LE1/j;->r:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lv3/o;->f(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, LE1/j;->s:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Li3/a;

    .line 19
    .line 20
    iget-object v0, v0, Li3/a;->r:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lm1/b;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget v1, p0, LE1/j;->r:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lm1/b;->h(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :pswitch_1
    iget-object v0, p0, LE1/j;->s:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ln4/c;

    .line 35
    .line 36
    iget v1, p0, LE1/j;->r:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ln4/c;->j(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    iget-object v0, p0, LE1/j;->s:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lcom/google/android/material/datepicker/l;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 47
    .line 48
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 54
    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    const-string v0, "RecyclerView"

    .line 58
    .line 59
    const-string v1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 60
    .line 61
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget v2, p0, LE1/j;->r:I

    .line 66
    .line 67
    invoke-virtual {v1, v0, v2}, Ld2/G;->x0(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void

    .line 71
    :pswitch_3
    iget-object v0, p0, LE1/j;->s:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    iget v2, p0, LE1/j;->r:I

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    const/4 v4, 0x0

    .line 83
    if-eq v2, v3, :cond_3

    .line 84
    .line 85
    :goto_1
    if-ge v4, v1, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, LE1/i;

    .line 92
    .line 93
    invoke-virtual {v2}, LE1/i;->a()V

    .line 94
    .line 95
    .line 96
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    :goto_2
    if-ge v4, v1, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, LE1/i;

    .line 106
    .line 107
    invoke-virtual {v2}, LE1/i;->b()V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
