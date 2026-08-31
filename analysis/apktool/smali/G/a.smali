.class public final synthetic LG/a;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:LG/e;

.field public final synthetic r:LB0/n0;

.field public final synthetic s:LB0/K;


# direct methods
.method public constructor <init>(LG/e;LB0/n0;LB0/K;)V
    .locals 6

    .line 1
    iput-object p1, p0, LG/a;->q:LG/e;

    .line 2
    .line 3
    iput-object p2, p0, LG/a;->r:LB0/n0;

    .line 4
    .line 5
    iput-object p3, p0, LG/a;->s:LB0/K;

    .line 6
    .line 7
    const-string v4, "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const-class v2, Lkotlin/jvm/internal/l;

    .line 12
    .line 13
    const-string v3, "localRect"

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LG/a;->r:LB0/n0;

    .line 2
    .line 3
    iget-object v1, p0, LG/a;->s:LB0/K;

    .line 4
    .line 5
    iget-object v2, p0, LG/a;->q:LG/e;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, LG/e;->x0(LG/e;LB0/n0;LB0/K;)Li0/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
