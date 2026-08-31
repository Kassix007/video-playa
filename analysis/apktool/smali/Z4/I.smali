.class public final LZ4/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# static fields
.field public static final q:LZ4/I;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LZ4/I;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ4/I;->q:LZ4/I;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Lv0/o;Lq5/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LZ4/G;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LZ4/G;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x7

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p1, v2, v0, p2, v1}, Lw/g1;->d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 14
    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 19
    .line 20
    return-object p1
.end method
