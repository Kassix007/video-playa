.class public final Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO4/b;


# static fields
.field public static final INSTANCE:Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;

.field private static final characters$delegate:Lm5/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;->INSTANCE:Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;

    .line 7
    .line 8
    new-instance v0, LK2/j;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, v1}, LK2/j;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;->characters$delegate:Lm5/h;

    .line 19
    .line 20
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;->characters_delegate$lambda$1()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static final characters_delegate$lambda$1()Ljava/util/Map;
    .locals 6

    .line 1
    invoke-static {}, LP4/a;->values()[LP4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    invoke-static {v1}, Ln5/y;->I(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/16 v2, 0x10

    .line 11
    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 18
    .line 19
    .line 20
    array-length v1, v0

    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_0
    if-ge v3, v1, :cond_1

    .line 23
    .line 24
    aget-object v4, v0, v3

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget-char v4, v4, LP4/a;->q:C

    .line 31
    .line 32
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object v2
.end method


# virtual methods
.method public getAuthor()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "FontAwesome"

    .line 2
    .line 3
    return-object v0
.end method

.method public getCharacters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;->characters$delegate:Lm5/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "The internet\'s most popular icon toolkit has been redesigned and built from scratch. On top of this, features like icon font ligatures, an SVG framework, official NPM packages for popular frontend libraries like React, and access to a new CDN."

    .line 2
    .line 3
    return-object v0
.end method

.method public getFontName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "FontAwesome"

    .line 2
    .line 3
    return-object v0
.end method

.method public getFontRes()I
    .locals 1

    const v0, 0x7f080002

    return v0
.end method

.method public getIcon(Ljava/lang/String;)LO4/a;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LP4/a;->valueOf(Ljava/lang/String;)LP4/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public getIconCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;->getCharacters()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getIcons()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;->getCharacters()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Iterable;

    .line 10
    .line 11
    new-instance v1, Ljava/util/LinkedList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Ln5/l;->z0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method

.method public getLicense()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Font Awesome Free License"

    .line 2
    .line 3
    return-object v0
.end method

.method public getLicenseUrl()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "https://github.com/FortAwesome/Font-Awesome/blob/master/LICENSE.txt"

    .line 2
    .line 3
    return-object v0
.end method

.method public getMappingPrefix()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "faw"

    .line 2
    .line 3
    return-object v0
.end method

.method public getRawTypeface()Landroid/graphics/Typeface;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/n2;->w(LO4/b;)Landroid/graphics/Typeface;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "https://fontawesome.com/"

    .line 2
    .line 3
    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "5.13.3.0"

    .line 2
    .line 3
    return-object v0
.end method
