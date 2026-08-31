.class public final Lf0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnDragListener;
.implements Lf0/c;


# instance fields
.field public final a:Lf0/f;

.field public final b:Lr/f;

.field public final c:Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lf0/f;

    .line 5
    .line 6
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, v0, Lf0/f;->G:J

    .line 12
    .line 13
    iput-object v0, p0, Lf0/a;->a:Lf0/f;

    .line 14
    .line 15
    new-instance v0, Lr/f;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Lr/f;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lf0/a;->b:Lr/f;

    .line 22
    .line 23
    new-instance v0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;-><init>(Lf0/a;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lf0/a;->c:Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 5

    .line 1
    new-instance p1, Lk3/c;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    sget-object v0, LB0/D0;->q:LB0/D0;

    .line 11
    .line 12
    iget-object v1, p0, Lf0/a;->b:Lr/f;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iget-object v3, p0, Lf0/a;->a:Lf0/f;

    .line 16
    .line 17
    packed-switch p2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    return v2

    .line 21
    :pswitch_0
    invoke-virtual {v3, p1}, Lf0/f;->z0(Lk3/c;)V

    .line 22
    .line 23
    .line 24
    return v2

    .line 25
    :pswitch_1
    invoke-virtual {v3, p1}, Lf0/f;->y0(Lk3/c;)V

    .line 26
    .line 27
    .line 28
    return v2

    .line 29
    :pswitch_2
    new-instance p2, LB0/a;

    .line 30
    .line 31
    const/16 v4, 0x1c

    .line 32
    .line 33
    invoke-direct {p2, v4, p1}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v3}, LB0/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eq p1, v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v3, p2}, LB0/g;->y(LB0/E0;LB5/c;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {v1}, Lr/f;->clear()V

    .line 47
    .line 48
    .line 49
    return v2

    .line 50
    :pswitch_3
    invoke-virtual {v3, p1}, Lf0/f;->x0(Lk3/c;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :pswitch_4
    invoke-virtual {v3, p1}, Lf0/f;->A0(Lk3/c;)V

    .line 56
    .line 57
    .line 58
    return v2

    .line 59
    :pswitch_5
    new-instance p2, Lkotlin/jvm/internal/u;

    .line 60
    .line 61
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v2, Lf0/e;

    .line 65
    .line 66
    invoke-direct {v2, p1, v3, p2}, Lf0/e;-><init>(Lk3/c;Lf0/f;Lkotlin/jvm/internal/u;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3}, Lf0/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eq v4, v0, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {v3, v2}, LB0/g;->y(LB0/E0;LB5/c;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-boolean p2, p2, Lkotlin/jvm/internal/u;->q:Z

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v0, Lr/a;

    .line 85
    .line 86
    invoke-direct {v0, v1}, Lr/a;-><init>(Lr/f;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {v0}, Lr/a;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    invoke-virtual {v0}, Lr/a;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lf0/f;

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Lf0/f;->B0(Lk3/c;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    return p2

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
