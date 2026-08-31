.class public abstract LN/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LL0/t;

    .line 2
    .line 3
    new-instance v1, LL0/s;

    .line 4
    .line 5
    invoke-direct {v1}, LL0/s;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, LL0/t;-><init>(LL0/s;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LN/s;->a:LL0/t;

    .line 12
    .line 13
    return-void
.end method

.method public static final a(ILP/o;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LP/z;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LP/T0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
