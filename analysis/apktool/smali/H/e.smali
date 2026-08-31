.class public abstract LH/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LH/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x32

    .line 2
    .line 3
    invoke-static {v0}, LH/e;->a(I)LH/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LH/e;->a:LH/d;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(I)LH/d;
    .locals 1

    .line 1
    new-instance v0, LH/c;

    .line 2
    .line 3
    int-to-float p0, p0

    .line 4
    invoke-direct {v0, p0}, LH/c;-><init>(F)V

    .line 5
    .line 6
    .line 7
    new-instance p0, LH/d;

    .line 8
    .line 9
    invoke-direct {p0, v0, v0, v0, v0}, LH/d;-><init>(LH/a;LH/a;LH/a;LH/a;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public static final b(F)LH/d;
    .locals 1

    .line 1
    new-instance v0, LH/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LH/b;-><init>(F)V

    .line 4
    .line 5
    .line 6
    new-instance p0, LH/d;

    .line 7
    .line 8
    invoke-direct {p0, v0, v0, v0, v0}, LH/d;-><init>(LH/a;LH/a;LH/a;LH/a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
