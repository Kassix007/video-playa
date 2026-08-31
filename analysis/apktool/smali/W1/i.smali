.class public final synthetic LW1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Lkotlin/jvm/internal/u;

.field public final synthetic r:Ljava/util/ArrayList;

.field public final synthetic s:Lkotlin/jvm/internal/w;

.field public final synthetic t:LW1/j;

.field public final synthetic u:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/u;Ljava/util/ArrayList;Lkotlin/jvm/internal/w;LW1/j;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW1/i;->q:Lkotlin/jvm/internal/u;

    iput-object p2, p0, LW1/i;->r:Ljava/util/ArrayList;

    iput-object p3, p0, LW1/i;->s:Lkotlin/jvm/internal/w;

    iput-object p4, p0, LW1/i;->t:LW1/j;

    iput-object p5, p0, LW1/i;->u:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, LT1/d;

    .line 2
    .line 3
    const-string v0, "entry"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LW1/i;->q:Lkotlin/jvm/internal/u;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Lkotlin/jvm/internal/u;->q:Z

    .line 12
    .line 13
    iget-object v0, p0, LW1/i;->r:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, -0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    iget-object v3, p0, LW1/i;->s:Lkotlin/jvm/internal/w;

    .line 23
    .line 24
    iget v4, v3, Lkotlin/jvm/internal/w;->q:I

    .line 25
    .line 26
    add-int/2addr v2, v1

    .line 27
    invoke-virtual {v0, v4, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput v2, v3, Lkotlin/jvm/internal/w;->q:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object v0, Ln5/s;->q:Ln5/s;

    .line 35
    .line 36
    :goto_0
    iget-object v1, p1, LT1/d;->r:LT1/p;

    .line 37
    .line 38
    iget-object v2, p0, LW1/i;->t:LW1/j;

    .line 39
    .line 40
    iget-object v3, p0, LW1/i;->u:Landroid/os/Bundle;

    .line 41
    .line 42
    invoke-virtual {v2, v1, v3, p1, v0}, LW1/j;->a(LT1/p;Landroid/os/Bundle;LT1/d;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 46
    .line 47
    return-object p1
.end method
