.class public final La6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV5/a;


# static fields
.field public static final a:La6/z;

.field public static final b:La6/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La6/z;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La6/z;->a:La6/z;

    .line 7
    .line 8
    sget-object v0, La6/y;->b:La6/y;

    .line 9
    .line 10
    sput-object v0, La6/z;->b:La6/y;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, La6/z;->b:La6/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, LD5/a;->m(LY5/b;)Lb6/i;

    .line 2
    .line 3
    .line 4
    new-instance v0, La6/x;

    .line 5
    .line 6
    sget-object v1, LZ5/a0;->a:LZ5/a0;

    .line 7
    .line 8
    sget-object v1, La6/n;->a:La6/n;

    .line 9
    .line 10
    new-instance v1, LZ5/E;

    .line 11
    .line 12
    invoke-direct {v1}, LZ5/E;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, LZ5/a;->c(LY5/b;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/util/Map;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La6/x;-><init>(Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
