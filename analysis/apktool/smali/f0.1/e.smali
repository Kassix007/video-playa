.class public final Lf0/e;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lkotlin/jvm/internal/u;


# direct methods
.method public constructor <init>(Lk3/c;Lf0/f;Lkotlin/jvm/internal/u;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lf0/e;->q:I

    .line 1
    iput-object p3, p0, Lf0/e;->r:Lkotlin/jvm/internal/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/u;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf0/e;->q:I

    .line 2
    iput-object p1, p0, Lf0/e;->r:Lkotlin/jvm/internal/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lf0/e;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LB0/E0;

    .line 7
    .line 8
    iget-object v0, p0, Lf0/e;->r:Lkotlin/jvm/internal/u;

    .line 9
    .line 10
    iget-boolean v1, v0, Lkotlin/jvm/internal/u;->q:Z

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    const-string v1, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"

    .line 16
    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast p1, Lw/j0;

    .line 21
    .line 22
    iget-boolean p1, p1, Lw/j0;->E:Z

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    move p1, v2

    .line 30
    :goto_1
    iput-boolean p1, v0, Lkotlin/jvm/internal/u;->q:Z

    .line 31
    .line 32
    xor-int/2addr p1, v2

    .line 33
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_0
    check-cast p1, Lf0/f;

    .line 39
    .line 40
    iget-boolean v0, p1, Lc0/l;->D:Z

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    sget-object p1, LB0/D0;->r:LB0/D0;

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_2
    iget-object v0, p1, Lf0/f;->F:Lf0/f;

    .line 48
    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    const-string v0, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    .line 53
    .line 54
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_2
    const/4 v0, 0x0

    .line 58
    iput-object v0, p1, Lf0/f;->F:Lf0/f;

    .line 59
    .line 60
    iget-object p1, p0, Lf0/e;->r:Lkotlin/jvm/internal/u;

    .line 61
    .line 62
    iget-boolean v0, p1, Lkotlin/jvm/internal/u;->q:Z

    .line 63
    .line 64
    iput-boolean v0, p1, Lkotlin/jvm/internal/u;->q:Z

    .line 65
    .line 66
    sget-object p1, LB0/D0;->q:LB0/D0;

    .line 67
    .line 68
    :goto_3
    return-object p1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
